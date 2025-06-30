package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: Initialize before each test
        calculator = new Calculator();
        System.out.println("Setup done");
    }

    @After
    public void tearDown() {
        // Cleanup: After each test
        calculator.reset();
        System.out.println("Teardown done");
    }

    @Test
    public void testAdd() {
        // Arrange: Already done in @Before

        // Act
        int result = calculator.add(5, 3);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testReset() {
        calculator.add(5, 5);
        calculator.reset();
        assertEquals(0, calculator.getMemory());
    }
}
