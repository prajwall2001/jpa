package com.xworkz.fertilizerJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table(name="fertilizer")
@AllArgsConstructor
@NoArgsConstructor
public class FertilizerEntity {
    @Id
    @Column(name="f_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="quantity")
    private int quantity;
    @Column(name="cost")
    private double cost;
    @Column(name="manf_date")
    private LocalDate manfDate;
    @Column(name="exp_date")
    private LocalDate expDate;


}
