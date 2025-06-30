package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {
    @Test
    public void testSub(){
        Subtraction obj = new Subtraction();
        int result = obj.sub(5,3);
        assertEquals(2,result);
    }
}
