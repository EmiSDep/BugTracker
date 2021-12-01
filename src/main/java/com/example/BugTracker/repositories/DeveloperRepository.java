package com.example.BugTracker.repositories;

import com.example.BugTracker.models.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
