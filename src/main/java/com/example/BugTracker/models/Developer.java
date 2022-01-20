package com.example.BugTracker.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Developer {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(mappedBy = "developer")
    // @JoinColumn(name = "developer_id", referencedColumnName = "id")
    private List<Bug> bugs;


    @OneToOne
    private Link link;

    public Developer(){}

    public Developer(String firstName, String lastName, String email, Link link) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
