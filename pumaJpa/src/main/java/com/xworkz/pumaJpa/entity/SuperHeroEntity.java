package com.xworkz.pumaJpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="super_hero")
@AllArgsConstructor

public class SuperHeroEntity {
    @Id
    @Column(name="s_id")
    private int id;
    @Column(name="s_realName")
    private String realName;
    @Column(name="s_fictionName")
    private String fictionalName;
    @Column(name="s_power")
    private String power;
    @Column(name="s_country")
    private String country;
    @Column(name="s_weakness")
    private String weakness;
}
