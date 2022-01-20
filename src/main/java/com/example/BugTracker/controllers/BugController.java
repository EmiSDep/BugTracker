package com.example.BugTracker.controllers;


import com.example.BugTracker.models.Bug;
import com.example.BugTracker.repositories.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/bugs")
public class BugController {
    @Autowired
    private BugRepository repository;

    @GetMapping
    public ResponseEntity<Iterable<Bug>> getAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Bug> createOne(@RequestBody Bug bug) {

        return new ResponseEntity<>(repository.save(bug), HttpStatus.CREATED);

    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Bug> updateOneById(@RequestBody Bug bug, @PathVariable Long id) {
//
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOneById(@PathVariable Long id) {
        repository.deleteById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @GetMapping("/dev/{devId}")
    public ResponseEntity<List<Bug>> getByDevId(@PathVariable Long devId) {
        return new ResponseEntity<>(repository.findByDeveloperId(devId), HttpStatus.OK);
    }

}
