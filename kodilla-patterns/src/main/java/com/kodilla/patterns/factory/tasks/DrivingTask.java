package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
    public boolean getTaskExecuted(){
        return taskExecuted;
    }
    public void setTaskExecuted(boolean taskExecuted) {
        this.taskExecuted = taskExecuted;
    }

    @Override
    public String executeTask() {
        return "DrivingTask is in progress";
    }
    public boolean isTaskExecuted(){
        getTaskExecuted();
        return taskExecuted ;
    }
}
