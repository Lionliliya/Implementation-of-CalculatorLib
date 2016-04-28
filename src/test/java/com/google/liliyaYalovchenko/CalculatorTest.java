package com.google.liliyaYalovchenko;


import org.junit.Assert;
import org.junit.Ignore;

public class CalculatorTest {

    @Ignore
    public void testDefaultOperations() throws Exception {
       Calculator calculator = new CalculatorImpl();
       int a = 5;
       int b = 10;
       Assert.assertEquals(-5, calculator.differenceOfNumbers(a, b));
       Assert.assertEquals(Integer.MIN_VALUE, calculator.sumOfNumbers(Integer.MAX_VALUE, 1));

    }

    @Ignore
    public void testMultiply() throws Exception {
        Multiply multiply = new Multiply();
        int a = 5;
        int b = 10;
        Assert.assertEquals(50, multiply.productOfNumbers(a, b));
        Assert.assertEquals(Integer.MIN_VALUE, multiply.productOfNumbers(Integer.MAX_VALUE, Integer.MIN_VALUE));

    }

}
