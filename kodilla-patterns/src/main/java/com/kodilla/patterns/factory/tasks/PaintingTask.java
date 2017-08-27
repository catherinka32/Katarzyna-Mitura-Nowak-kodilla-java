package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String TaskName;
    private final String color;
    private final String whatToPaint;
    private boolean taskExecuted = false;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.TaskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return TaskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    public boolean getTaskExecuted(){
        return taskExecuted;
    }
    public void setTaskExecuted(boolean taskExecuted){
        this.taskExecuted=taskExecuted;
    }

    @Override
    public String executeTask() {
        return "PaintingTask is in progress";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}