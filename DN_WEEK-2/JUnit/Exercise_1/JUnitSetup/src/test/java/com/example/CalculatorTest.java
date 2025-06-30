package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator cal  = new Calculator();
        int result = cal.add(5,3);
        assertEquals(8,result);
    }
}
