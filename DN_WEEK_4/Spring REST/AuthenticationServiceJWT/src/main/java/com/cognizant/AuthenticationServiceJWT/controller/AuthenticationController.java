package com.cognizant.AuthenticationServiceJWT.controller;

import com.cognizant.AuthenticationServiceJWT.model.JWTauth;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header");
        }

  
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);
        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        // Validate user (for demo, hardcoded)
        if (!username.equals("user") || !password.equals("pwd")) {
            return ResponseEntity.status(403).body("Invalid credentials");
        }

        // Generate JWT token
        String token = JWTauth.generateToken(username);

        return ResponseEntity.ok().body("{\"token\": \"" + token + "\"}");
    }
}
