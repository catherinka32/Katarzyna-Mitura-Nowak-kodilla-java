package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int updateCount;

    public Mentor(String name){
        this.name = name;
    }

    @Override
    public void update(BoardOfTasks boardOfTasks) {
        System.out.println(name + " : new task to check " + boardOfTasks.getName() + "\n" + "(Total: " + boardOfTasks.getTasks().size() + "messages)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
