package com.google.liliyaYalovchenko;


public class Multiply implements MultiplyNumbers {
    @Override
    public int productOfNumbers(int i, int i1) {
        return i*i1;
    }

    @Override
    public long productOfNumbers(long l, long l1) {
        return l*l1;
    }

    @Override
    public float productOfNumbers(float v, float v1) {
        return v*v1;
    }

    @Override
    public double productOfNumbers(double v, double v1) {
        return v*v1;
    }
}
