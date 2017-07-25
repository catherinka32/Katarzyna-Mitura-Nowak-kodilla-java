package com.kodilla.stream.beautifier;

/**
 * Created by Iga on 25.07.2017.
 */
public class PoemBeautifier {
    public String beautify (String string , PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(string);
        System.out.println("Decorated sentence:" + result);
        return result;

    }
}
