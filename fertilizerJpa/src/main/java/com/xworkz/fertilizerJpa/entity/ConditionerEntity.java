package com.xworkz.fertilizerJpa.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name="conditioner")
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name="updateNetQuantityByBrand",query = "UPDATE ConditionerEntity t SET t.netQuantity = :nq WHERE t.brand = :br")
@NamedQuery(name="updateRecommendedUsesByBrand",query = "UPDATE ConditionerEntity t SET t.recommendedUses = :ru WHERE t.brand = :br")
@NamedQuery(name="findAllByBrand",query = "select et from ConditionerEntity et where et.brand=:br ")
@NamedQuery(name="findAllByHairType",query = "select ent from ConditionerEntity ent where ent.hairType=:ht ")
@NamedQuery(name="findScentById",query = "SELECT c.scent FROM ConditionerEntity c WHERE c.id = :idd")
public class ConditionerEntity {
    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(name="brand")
    private String brand;
    @NonNull
    @Column(name="item_form")
    private String itemForm;
    @NonNull
    @Column(name="hair_type")
    private String hairType;
    @NonNull
    @Column(name="product_benifits")
    private String productBenifits;
    @NonNull
    @Column(name="age_range")
    private String ageRange;
    @NonNull
    @Column(name="recommended_uses")
    private String recommendedUses;
    @NonNull
    @Column(name="net_quantity")
    private int netQuantity;
    @NonNull
    @Column(name="no_of_items")
    private int noOfItems;
    @NonNull
    @Column(name="scent")
    private String scent;
    @NonNull
    @Column(name="material_type_free")
    private String materialTypeFree;

}
