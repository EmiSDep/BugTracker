package com.example.BugTracker.repositories;

import com.example.BugTracker.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
