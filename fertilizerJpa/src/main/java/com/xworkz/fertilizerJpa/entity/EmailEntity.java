package com.xworkz.fertilizerJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name="email")
@AllArgsConstructor
@NoArgsConstructor
public class EmailEntity {
    @Id
    @Column(name="e_id")
    private int id;
    @Column(name="address")
    private String address;
    @Column(name="e_from")
    private String from;
    @Column(name="e_to")
    private String to;
    @Column(name="subject")
    private String subject;
    @Column(name="cc")
    private String cc;
    @Column(name="bcc")
    private String bcc;
    @Column(name="body")
    private String body;
    @Column(name="sentDate")
    private LocalDate sentDate;
    @Column(name="success")
    private boolean success;
}
