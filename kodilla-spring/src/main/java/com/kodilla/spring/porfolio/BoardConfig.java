package com.kodilla.spring.porfolio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean
    public Board getBoard(){
        return new Board(getToDoList(),getInProgress(),getDoneList());
    }
    @Bean(name = "task1")
    public TaskList getToDoList(){
        return new TaskList();
    }
    @Bean(name = "task2")
    public TaskList getInProgress(){
        return new TaskList();
    }
    @Bean(name = "task3")
    public TaskList getDoneList(){
        return new TaskList();
    }
}
