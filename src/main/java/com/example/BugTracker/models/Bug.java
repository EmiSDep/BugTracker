package com.example.BugTracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bug {

    @Id
    @GeneratedValue
    private Long id;
    private String bugTitle;
    private String bugDescription;

    public Bug(){}

    public Bug(String bugTitle, String bugDescription){
        this.bugTitle = bugTitle;
        this.bugDescription = bugDescription;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBugTitle() {
        return bugTitle;
    }

    public void setBugTitle(String bugTitle) {
        this.bugTitle = bugTitle;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        this.bugDescription = bugDescription;
    }
}
