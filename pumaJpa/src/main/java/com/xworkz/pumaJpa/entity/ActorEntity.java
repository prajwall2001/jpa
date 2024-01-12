package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="actor")
@AllArgsConstructor
public class ActorEntity {
    @Id
    @Column(name="a_id")
    private int id;
    @Column(name="actor_name")
    private String actorName;
    @Column(name="direcror")
    private String director;
    @Column(name="movieName")
    private String movieName;
    @Column(name="noOfMovies")
    private int noOfMovies;
    @Column(name="budget")
    private double budget;
}
