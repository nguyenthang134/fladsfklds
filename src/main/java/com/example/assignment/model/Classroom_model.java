package com.example.assignment.model;

import com.example.assignment.entity.Class_info;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Classroom_model extends PagingAndSortingRepository<Class_info, Integer> {
}
