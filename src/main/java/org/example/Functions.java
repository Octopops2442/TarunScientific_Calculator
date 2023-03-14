package org.example;

import java.lang.Math;

public class Functions {
    public Double Add(double a, double b) {
        return a + b;
    }

    public Double Subtract(double a, double b) {
        return a - b;
    }

    public Double Multiply(double a, double b) {
        return a*b;
    }

    public Double Divide(double a, double b) {
        if (b == 0) {
            return null;
        }
        return a/b;
    }

    public Double SquareRoot(Double a) {
        return Math.sqrt(a);
    }

    public Long Factorial(int a) {
        if (a == 1) {
            return (long)1;
        }
        return a*Factorial(a - 1);
    }

    public Double Logarithm(double a) {
        return Math.log(a);
    }

    public Double Power(double a, double b) {
        return Math.pow(a, b);
    }
}
