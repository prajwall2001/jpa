package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name="festival")
@AllArgsConstructor
public class FestivalEntity {
    @Id
    @Column(name="f_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="location")
    private String location;
    @Column(name="yearEstablished")
    private int yearEstablished;
    @Column(name="religion")
    private String religion;
    @Column(name="ticketPrice")
    private double ticketPrice;

}
