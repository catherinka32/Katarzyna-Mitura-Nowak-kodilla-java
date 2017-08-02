package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {secondChallenge.probablyIWillThrowException(2.5, 1.75);
            //System.out.println("Done");
        }catch(Exception e){
            System.out.println("I'm not sure what I'm doing");
        }finally{
            System.out.println("It's the end of action");
        }
    }
}
