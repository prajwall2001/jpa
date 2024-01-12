package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="sports")
@AllArgsConstructor
public class SportsEntity {
    @Id
    @Column(name="s_id")
    private int id;
    @Column(name="sports_name")
    private String sportsName;
    @Column(name="noOfPlayers")
    private int noOfPlayers;
    @Column(name="teamName")
    private String teamName;
    @Column(name="country")
    private String country;
    @Column(name="medals")
    private  String medals;

}
