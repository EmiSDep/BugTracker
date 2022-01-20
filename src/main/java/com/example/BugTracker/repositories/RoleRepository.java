package com.example.BugTracker.repositories;

import com.example.BugTracker.models.auth.ERole;
import com.example.BugTracker.models.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}