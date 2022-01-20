package com.example.BugTracker.repositories;

import com.example.BugTracker.models.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
