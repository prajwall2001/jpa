package com.xworkz.amazonJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="amazon")
@AllArgsConstructor
@NoArgsConstructor
public class BulbEntity {
    @Id
    @Column(name="a_id")
    private int id;
    @Column(name="brand")
    private String brand;
    @Column(name="lightType")
    private String lightType;
    @Column(name="specialFeature")
    private String specialFeature;
    @Column(name="wattage")
    private String wattage;
    @Column(name="bulbShapeSize")
    private String bulbShapeSize;
    @Column(name="bulbBase")
    private String bulbBase;
    @Column(name="incandescentEquiWattage")
    private String incandescentEquiWattage;
    @Column(name="lightColor")
    private String lightColor;
    @Column(name="voltage")
    private String voltage;
    @Column(name="quantity")
    private int quantity;
}
