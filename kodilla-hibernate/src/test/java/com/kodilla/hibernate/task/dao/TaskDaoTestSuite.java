package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Task readTask = taskDao.findOne(id);
        Assert.assertEquals(id, readTask.getId());

        //CleanUp
        taskDao.delete(id);
    }

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDao.findByDuration(duration);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
//        int id1 = readTasks.get(1).getId();
//        int id2 = readTasks.get(2).getId();
//        int id3 = readTasks.get(3).getId();
//        int id4 = readTasks.get(4).getId();
//        int id5 = readTasks.get(5).getId();
//        int id6= readTasks.get(6).getId();
//        int id7 = readTasks.get(7).getId();
        taskDao.delete(id);
//        taskDao.delete(id1);
//        taskDao.delete(id2);
//        taskDao.delete(id3);
//        taskDao.delete(id4);
//        taskDao.delete(id5);
//        taskDao.delete(id6);
//        taskDao.delete(id7);

    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(task);
        int id = task.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskDao.delete(id);
    }
}

