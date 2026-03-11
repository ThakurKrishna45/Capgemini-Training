package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator= new Calculator();
    @Test
    public void testAdd(){
        assertEquals(6,calculator.add(2,4));
    }
    @Test
    public void testSubtract(){
        assertEquals(3,calculator.subtract(11,8));
    }
    @Test
    public void testMultiply(){
        assertEquals(34,calculator.multiply(2,17));
    }
    @Test
    public void testDivision(){
        assertEquals(3,calculator.division(9,3));
    }
}
