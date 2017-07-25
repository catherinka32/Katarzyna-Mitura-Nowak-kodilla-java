package com.kodilla.stream.lambda;

/**
 * Created by Iga on 23.07.2017.
 */
public class ExecuteSaySomething implements Executor {
    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}
