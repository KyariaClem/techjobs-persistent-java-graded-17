package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Please provide location")
    @Size(max = 100)
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    @NotNull(message= "Must enter an employer")
    public List<Job> jobs = new ArrayList<>();

    public Employer() {

    }

    public Employer(String location) {
        super();
        this.location = location;
    }

    public String
    getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
