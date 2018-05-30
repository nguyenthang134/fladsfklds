package com.example.assignment.model;

import com.example.assignment.entity.Attendance_slot;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface Attendanceslot_model extends PagingAndSortingRepository<Attendance_slot, Integer> {
}
