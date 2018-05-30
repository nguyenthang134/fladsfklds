package com.example.assignment.model;

import com.example.assignment.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Student_model extends PagingAndSortingRepository<Student, Integer> {
}
