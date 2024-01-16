package com.xworkz.taskJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="trafficfine")
@AllArgsConstructor
@NoArgsConstructor
public class TrafficFineEntity {
    @Id
    @Column(name="t_id")
    private int id;
    @Column(name="violation")
    private String violation;
    @Column(name="vehicleNo")
    private String vehicleNo;
    @Column(name="vehicleOwner")
    private String vehicleOwner;
    @Column(name="fine")
    private double fine;
}
