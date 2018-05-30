package com.example.assignment.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @ManyToOne
    private Class_info classInfo;
    public Class_info getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(Class_info classInfo) {
        this.classInfo = classInfo;
    }
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {

        this.name = name;
    }
}
