package com.google.liliyaYalovchenko;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testDefaultOperations() throws Exception {
       Calculator calculator = new Calculator();
       int a = 5;
       int b = 10;
       Assert.assertEquals(-5, calculator.differenceOfNumbers(a, b));
       Assert.assertEquals(Integer.MIN_VALUE, calculator.sumOfNumbers(Integer.MAX_VALUE, 1));

    }

    @Test
    public void testMultiply() throws Exception {
        Calculator calculator = new Calculator();
        Multiply multiply = new Multiply();
        int a = 5;
        int b = 10;
        Assert.assertEquals(50, multiply.productOfNumbers(a, b));
        Assert.assertEquals(Integer.MIN_VALUE, multiply.productOfNumbers(Integer.MAX_VALUE, Integer.MIN_VALUE));

    }

}
