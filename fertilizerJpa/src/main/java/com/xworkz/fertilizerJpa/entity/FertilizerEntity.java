package com.xworkz.fertilizerJpa.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name="fertilizer")
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findAllByQuantity", query="select ferti from FertilizerEntity as ferti where ferti.quantity=:qt ")
public class FertilizerEntity {
    @Id
    @Column(name="f_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(name="name")
    private String name;
    @NonNull
    @Column(name="quantity")
    private int quantity;
    @NonNull
    @Column(name="cost")
    private double cost;
    @NonNull
    @Column(name="manf_date")
    private LocalDate manfDate;
    @NonNull
    @Column(name="exp_date")
    private LocalDate expDate;


}
