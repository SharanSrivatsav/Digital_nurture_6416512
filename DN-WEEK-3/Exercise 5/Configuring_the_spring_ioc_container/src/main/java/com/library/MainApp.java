package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring config from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Fetch the bean from container
        BookService bookService = (BookService) context.getBean("bookService");

        // Use the service
        bookService.addBook("Spring for No0bi3 Legends");
    }
}
