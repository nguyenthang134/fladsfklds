package com.example.assignment.entity;

import javax.persistence.*;

@Entity
public class Attendance_detail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Attendance_slot attendanceSlots;

    public Attendance_slot getAttendanceSlots() {
        return attendanceSlots;
    }

    public void setAttendanceSlots(Attendance_slot attendanceSlots) {
        this.attendanceSlots = attendanceSlots;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    private Student student;
    private int slot_id;
    private String time;
    private int status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
