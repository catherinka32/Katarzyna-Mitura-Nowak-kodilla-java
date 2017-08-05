package com.kodilla.good.patterns.challenges;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main (String args[]){
        MovieStore movieStore = new MovieStore();
        String moviesTitles = movieStore.getMovies().entrySet().stream()
                .map(s -> s.getValue().get(0))
                .collect(Collectors.joining(" ! ", "",""));
        System.out.println(moviesTitles);
    }
}
