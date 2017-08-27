package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setTaskExecuted(boolean taskExecuted) {
        this.taskExecuted = taskExecuted;
        }
    public boolean getTaskExecuted(){
        return taskExecuted;
    }
    @Override
    public String executeTask() {
        return "ShoppingTask is in progress";
    }

    @Override
    public boolean isTaskExecuted(){
        return taskExecuted;
    }
}
