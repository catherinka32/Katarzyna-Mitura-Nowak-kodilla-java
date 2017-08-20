package com.kodilla.spring.porfolio;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;
    public Board(@Qualifier("list1") TaskList toDoList, @Qualifier("list2")TaskList inProgressList, @Qualifier("list3")
            TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

   /*public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }*/
    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    @Override
    public String toString() {
        return "Board{" +
                "toDoList=" + toDoList +
                ", inProgressList=" + inProgressList +
                ", doneList=" + doneList +
                '}';
    }
}


