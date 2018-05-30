package com.example.assignment.model;

import com.example.assignment.entity.Timeslot;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Timeslot_model extends PagingAndSortingRepository<Timeslot, Integer> {
}
