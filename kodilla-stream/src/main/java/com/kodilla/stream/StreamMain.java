package com.kodilla.stream;

/**
 * Created by Iga on 23.07.2017.
 */
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new  ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4,
                FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4,
                FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4,
                FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4,
                FunctionalCalculator::divideAByB);
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("I don't know what I'm doing now",(string) -> "Fararara " + string );
        poemBeautifier.beautify("I don't know what I'm doing now",(string) -> string.toUpperCase() );
        poemBeautifier.beautify("I don't know what I'm doing now",(string) -> "ABC " + string + " ABC" );
        poemBeautifier.beautify("I don't know what I'm doing now",(string) -> string.substring(7 , 17) );
        poemBeautifier.beautify("I don't know what I'm doing now",(string) -> string.concat("hfkhkdtd") );

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
