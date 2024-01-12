package com.xworkz.pumaJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="films")
@AllArgsConstructor
public class FilmEntity {
    @Id
    @Column(name="f_id")
    private int id;
    @Column(name="film_name")
    private String filmName;
    @Column(name="director")
    private String director;
    @Column(name="producer")
    private String producer;
    @Column(name="language")
    private String language;
    @Column(name="budget")
    private double budget;
}
