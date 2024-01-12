package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="traffic")
@AllArgsConstructor
public class TrafficEntity {
    @Id
    @Column(name="t_id")
    private int id;
    @Column(name="color_indication")
    private String colorIndication;
    @Column(name="noOfSides")
    private int noOfSides;
    @Column(name="noOfVehicle")
    private int noOfVehicles;
    @Column(name="time")
    private double time;
    @Column(name="area_name")
    private String areaName;
}
