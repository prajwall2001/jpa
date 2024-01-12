package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="shop")
@AllArgsConstructor
public class ShopEntity {
    @Id
    @Column(name="s_id")
    private int id;
    private String productName;
    private String productType;
    private int quantity;
    private double cost;
    private String manufacturer;
}
