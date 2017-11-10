package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BoardOfTasks implements Observable {
    private final Deque<String> tasks;
    private final String name;
    private final List<Observer> observers;// or Observer observer;

    public BoardOfTasks(String name) {
        tasks = new ArrayDeque<>();
        observers = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers){
            observer.update(this);
        }
    }
    public String getName(){
        return name;
    }
    public Deque<String> getTasks(){
        return tasks;
    }
}
