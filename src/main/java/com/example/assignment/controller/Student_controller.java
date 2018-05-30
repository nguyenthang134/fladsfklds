package com.example.assignment.controller;
import com.example.assignment.entity.Attendance_slot;
import com.example.assignment.entity.Timeslot;
import com.example.assignment.model.Attendanceslot_model;
import com.example.assignment.model.Classroom_model;
import com.example.assignment.model.Timeslot_model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;
import java.util.List;

@Controller
public class Student_controller {
    @Autowired
    private Timeslot_model time_slot;
    @Autowired
    private Attendanceslot_model attendance_slot;
    @Autowired
    private Classroom_model classroom;

    @RequestMapping(path = "/attendance/list", method = RequestMethod.GET)
    public String getList(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {
        List<Attendance_slot> attendanceslot = (List<Attendance_slot>) attendance_slot.findAll();
        model.addAttribute("attendanceslot", attendanceslot);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        model.addAttribute("datetime", Calendar.getInstance().getTime());
        return "attendance_list";
    }
}
