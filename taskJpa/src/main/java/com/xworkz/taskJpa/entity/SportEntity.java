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
@Table(name="sport")
@AllArgsConstructor
@NoArgsConstructor
public class SportEntity {
    @Id
    @Column(name="s_id")
    private int id;
    @Column(name="name")
     private String name;
    @Column(name="originCountry")
     private String originCountry;
    @Column(name="captainName")
     private String captainName;
    @Column(name="totalPlayers")
     private int totalPlayers;
}
