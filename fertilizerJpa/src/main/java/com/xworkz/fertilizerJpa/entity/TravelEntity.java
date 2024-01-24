package com.xworkz.fertilizerJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name="travel")
@AllArgsConstructor
@NoArgsConstructor
public class TravelEntity {
    @Id
    @Column(name="t_id")
    private int id;
    @Column(name="source")
    private String source;
    @Column(name="destination")
    private String destination;
    @Column(name="budget")
    private double budget;
    @Column(name="distance")
    private double distance;
    @Column(name="purpose")
    private String purpose;
    @Column(name="duration")
    private double duration;
    @Column(name="modeType")
    private String modeType;
    @Column(name="date")
    private LocalDate date;
    @Column(name="returnDate")
    private LocalDate returnDate;
}
