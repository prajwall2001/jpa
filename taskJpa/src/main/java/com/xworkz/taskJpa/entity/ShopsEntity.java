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
@Table(name="shops")
@AllArgsConstructor
@NoArgsConstructor
public class ShopsEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="gstNo")
    private String gstNo;
    @Column(name="address")
    private String address;
    @Column(name="pincode")
    private int pincode;

}
