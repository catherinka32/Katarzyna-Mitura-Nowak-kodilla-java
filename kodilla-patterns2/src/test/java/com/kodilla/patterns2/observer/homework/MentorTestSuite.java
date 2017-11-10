package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate(){
        //Given
        BoardOfTasks haniaNovakTasks = new HaniaNovakTasks();
        BoardOfTasks peterHankeTasks = new PeterHankeTasks();

        Mentor giovanna = new Mentor("Giovvanna Piovelli");
        Mentor trevor = new Mentor("Trevor Bghialetti");

        haniaNovakTasks.registerObserver(giovanna);
        peterHankeTasks.registerObserver(trevor);
        //When
        haniaNovakTasks.addTask("Task 1.1");
        haniaNovakTasks.addTask("Task 1.2");
        peterHankeTasks.addTask("Task 1.1");
        peterHankeTasks.addTask("Task 1.2");
        peterHankeTasks.addTask("Task 1.3");
        peterHankeTasks.addTask("Task 1.4");
        //Then

        assertEquals(4, trevor.getUpdateCount());
        assertEquals(2, giovanna.getUpdateCount());

    }
}
