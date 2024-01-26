package com.xworkz.fertilizerJpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name="temple")
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findAllByLocation",query = "SELECT ent FROM TempleEntity as ent WHERE ent.name=:nm ")
@NamedQuery(name = "findAllByEntryFeeGreaterThan", query = "SELECT ent FROM TempleEntity as ent WHERE ent.entryFee > :fee")
@NamedQuery(name = "findAllByEntryFeeBetween", query = "SELECT en FROM TempleEntity en WHERE en.entryFee BETWEEN :startFee AND :endFee")
@NamedQuery(name = "findAllByInaguratedDateGreaterThan", query = "SELECT ent FROM TempleEntity as ent WHERE ent.inaguratedDate > :ing")
@NamedQuery(name = "findAllByMainGodAndLocation", query = "SELECT e FROM TempleEntity e WHERE e.mainGod = :mg AND e.location = :lc")
@NamedQuery(name="findById",query = "SELECT ent FROM TempleEntity as ent WHERE ent.id=:idd ")
@NamedQuery(name = "findByIdAndMainGod", query = "SELECT e FROM TempleEntity e WHERE e.id = :idd AND e.mainGod = :mainGodd")
@NamedQuery(name = "findTotal", query = "SELECT COUNT(ent) FROM TempleEntity ent")
@NamedQuery(name = "findTempleByMaxEntryFee", query = "SELECT t FROM TempleEntity t WHERE t.entryFee = (SELECT MAX(tt.entryFee) FROM TempleEntity tt)")
@NamedQuery(name="updateLocationByName",query = "UPDATE TempleEntity t SET t.location = :loc WHERE t.name = :nm")
@NamedQuery(name="updateEntryFeeByName",query = "UPDATE TempleEntity t SET t.entryFee = :ef WHERE t.name = :nam")
@NamedQuery(name="updateLocationAndDimensionById",query = "update TempleEntity ent Set ent.location=:lo, ent.dimension=:dm where ent.id=:i")
@NamedQuery(name="deleteByName",query = "delete from TempleEntity entt where entt.name=:nm")
@NamedQuery(name = "updateAllVipEntryFee", query = "UPDATE TempleEntity v SET v.entryFee = :entf WHERE v.id IN :ids")
public class TempleEntity {
    @Id
    @Column(name="t_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(name="name")
    private String name;
    @NonNull
    @Column(name="location")
    private String location;
    @NonNull
    @Column(name="entry_fee")
    private double entryFee;
    @NonNull
    @Column(name="vip_entry_fee")
    private double vipEntryFee;
    @NonNull
    @Column(name="inagurated_date")
    private LocalDate inaguratedDate;
    @NonNull
    @Column(name="main_god")
    private String mainGod;
    @NonNull
    @Column(name="dimension")
    private double dimension;
}


