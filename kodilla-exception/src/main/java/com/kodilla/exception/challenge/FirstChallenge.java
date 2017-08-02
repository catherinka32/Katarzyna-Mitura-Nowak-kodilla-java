package com.kodilla.exception.challenge;

public class FirstChallenge {
    public double divide(double a, double b)throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        try{
            double result = firstChallenge.divide(12.0, 3.0);
            System.out.println("Result is: " + result);
        }catch(ArithmeticException e ){
            System.out.println("Remember: don't divide by zero!!!");
        }finally{
            System.out.println("It's the end of action :)");
        }
    }
}