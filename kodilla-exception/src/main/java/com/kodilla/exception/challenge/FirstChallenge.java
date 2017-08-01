package com.kodilla.exception.challenge;

public class FirstChallenge {
    public double divide(double a, double b) {
        double result = 0;
        try {
            result = a/b;
            System.out.println("Result is : " + result);
        }catch (Exception e) {
            System.out.println("Remember: don't divide by zero!!!");

        }finally {
            System.out.println("It's the end of action :)");
        }
        return result;
    }
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        firstChallenge.divide(12.0, 0.0);
    }
}