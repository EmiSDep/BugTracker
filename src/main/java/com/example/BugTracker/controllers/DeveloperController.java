package com.example.BugTracker.controllers;


import com.example.BugTracker.models.Developer;
import com.example.BugTracker.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/developers")
public class DeveloperController {
    @Autowired
    private DeveloperRepository repository;

    @GetMapping
    public @ResponseBody
    List<Developer> getDevelopers() {
        return repository.findAll();
    }

    @PostMapping
    public @ResponseBody
    Developer createDeveloper(@RequestBody Developer newDeveloper){
        return repository.save(newDeveloper);
    }

    @GetMapping("/{id}")
    public @ResponseBody Developer getOneDeveloper(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public @ResponseBody Developer updateDeveloper(@PathVariable Long id, @RequestBody Developer updates) {
        Developer developer = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if(updates.getFirstName() != null) developer.setFirstName(updates.getFirstName());
        if(updates.getLastName() != null) developer.setLastName(updates.getLastName());
        if(updates.getEmail() != null) developer.setEmail(updates.getEmail());

        return repository.save(updates);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDeveloper(@PathVariable Long id){
        repository.deleteById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }
}
