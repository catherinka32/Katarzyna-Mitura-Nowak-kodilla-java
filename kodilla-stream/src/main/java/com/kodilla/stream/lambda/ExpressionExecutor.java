package com.kodilla.stream.lambda;

/**
 * Created by Iga on 24.07.2017.
 */
public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }
}