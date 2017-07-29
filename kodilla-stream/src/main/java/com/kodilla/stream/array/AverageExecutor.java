package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class AverageExecutor implements ArrayOperation{
    private final int[] numbers;

    public AverageExecutor(int[] numbers) {
        this.numbers = numbers;
    }

    public double getAverage(int[] numbers){
        double average =0;
        IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        return average;
    }
}
