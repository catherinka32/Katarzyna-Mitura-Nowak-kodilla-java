package com.kodilla.testing.calculator;

/**
 * Created by Mitura on 2017-07-13.
 */
public class Calculator {
    int a ;
    int b ;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        int sum = a + b;
        System.out.println("Sum of a and b equals: " + sum );
        return sum;
    }
    public int subtract(){
        int difference = a - b;
        System.out.println("Difference of a nad b equals: " + difference );
        return difference;
    }
}
