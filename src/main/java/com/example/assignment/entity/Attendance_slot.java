package com.example.assignment.entity;

import javax.persistence.*;

@Entity
public class Attendance_slot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Class_info classInfo;
    @ManyToOne
    private Timeslot timeslots;
    private String attendance_date;

    public String getAttendance_date() {
        return attendance_date;
    }

    public void setAttendance_date(String attendance_date) {
        this.attendance_date = attendance_date;
    }

    private int subject_id;
    private int status;

    public int getId() {
        return id;
    }

    public Class_info getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(Class_info classInfo) {
        this.classInfo = classInfo;
    }

    public Timeslot getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(Timeslot timeslots) {
        this.timeslots = timeslots;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
