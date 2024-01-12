package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@Table(name="transport")
public class TransportEntity {
    @Id
    @Column(name="t_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="capacity")
    private int capacity;
    @Column(name="speed")
    private double speed;
    @Column(name="isElectric")
    private int isElectric;
    @Column(name="manufacturer")
    private String manufacturer;
}
