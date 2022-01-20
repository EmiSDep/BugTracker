package com.example.BugTracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    private String developerComment;

    public Comment(){}

    public Comment(String developerComment){
        this.developerComment = developerComment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeveloperComment() {
        return developerComment;
    }

    public void setDeveloperComment(String developerComment) {
        this.developerComment = developerComment;
    }
}
