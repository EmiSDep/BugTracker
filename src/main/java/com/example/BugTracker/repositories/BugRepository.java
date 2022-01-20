package com.example.BugTracker.repositories;

import com.example.BugTracker.models.Bug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BugRepository extends JpaRepository<Bug, Long> {

    List<Bug> findByDeveloperId(Long id);
}
