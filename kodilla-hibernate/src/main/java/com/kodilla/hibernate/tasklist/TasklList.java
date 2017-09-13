package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public final class TasklList {
    private int id;
    private String listName;
    private String description;

    public TasklList(){
    }

    public TasklList(int id, String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID",unique = true)

    public int getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
