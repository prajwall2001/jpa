package com.xworkz.fertilizerJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="disease")
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseEntity {
    @Id
    @Column(name="d_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="person_name")
    private String personName;
    @Column(name="symptoms")
    private String symptoms;
    @Column(name="treatment")
    private String treatment;
    @Column(name="affected_population")
    private String affectedPopulation;
}
