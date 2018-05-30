package com.example.assignment.entity;

import javax.persistence.*;

@Entity
public class Student_class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    @ManyToOne
    private Class_info classInfo;
    public Class_info getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(Class_info classInfo) {
        this.classInfo = classInfo;
    }
    private String created_date;
    private int status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
