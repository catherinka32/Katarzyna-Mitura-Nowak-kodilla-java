package com.kodilla.spring.porfolio;


import java.util.List;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public void present() {
        System.out.println("Presenting: " + toDoList.getList() + ", " + inProgressList.getList() + ", " + doneList.getList());
    }
    /*public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }*/

}


