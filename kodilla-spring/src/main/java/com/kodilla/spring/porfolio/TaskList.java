package com.kodilla.spring.porfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getList() {
        return new ArrayList<>(tasks);
    }
}
