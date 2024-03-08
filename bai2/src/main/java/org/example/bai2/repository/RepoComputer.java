package org.example.bai2.repository;

import org.example.bai2.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoComputer extends JpaRepository<Computer,Integer> {
    List<Computer>findAllByNameContaining(String name);
}

