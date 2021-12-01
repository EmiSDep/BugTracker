package com.example.BugTracker.repositories;

import com.example.BugTracker.models.Bug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugRepository extends JpaRepository<Bug, Long> {
}
