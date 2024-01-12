package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="ocean")
@AllArgsConstructor
public class OceanEntity {
    @Id
    @Column(name="o_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="depth")
    private double depth;
    @Column(name="noOfSpecies")
    private int numberOfSpecies;
    @Column(name="habitatType")
    private String habitatType;
    @Column(name="avgTemperature")
    private double averageTemperature;
}
