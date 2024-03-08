package org.example.bai1.repository;

import org.example.bai1.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepo extends JpaRepository<Staff,Integer> {
    List<Staff>findByFullNameContaining(String name);
}