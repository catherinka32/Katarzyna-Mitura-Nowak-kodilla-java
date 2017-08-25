package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String TaskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        TaskName = taskName;
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
    @Override
    public String executeTask() {
        return "PaintingTask is in progress";
    }

    @Override
    public boolean isTaskExecuted(){
        return false;
    }
}
