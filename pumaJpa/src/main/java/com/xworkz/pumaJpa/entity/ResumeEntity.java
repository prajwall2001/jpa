package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="resume")
@AllArgsConstructor
public class ResumeEntity {
    @Id
    @Column(name="r_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="qualification")
    private String qualification;
    @Column(name="collegeName")
    private String collegeName;
    @Column(name="cgpa")
    private double cgpa;
    @Column(name="year_of_pass")
    private int yearOfPass;
}
