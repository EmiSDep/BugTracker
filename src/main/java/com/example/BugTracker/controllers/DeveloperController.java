package com.example.BugTracker.controllers;


import com.example.BugTracker.models.Developer;
import com.example.BugTracker.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/developers")
public class DeveloperController {
    @Autowired
    private DeveloperRepository repository;

    @PostMapping
    public @ResponseBody
    Developer createDeveloper(@RequestBody Developer newDeveloper){
        return repository.save(newDeveloper);
    }

    @GetMapping("/{id}")
    public @ResponseBody Developer getOneDeveloper(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
