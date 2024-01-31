package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.ConditionerEntity;

import java.util.Collections;
import java.util.List;

public interface ConditionerRepository {
    Integer save(ConditionerEntity entity);


    default void saveAll(List<ConditionerEntity> list){

    }
    default void updateNetQuantityByBrand(int netQuantity,String brand){

    }
    void updateRecommendedUsesByBrand(String brand ,String recommendedUses);

    default List<ConditionerEntity> findAllByBrand(String brand){
        return Collections.emptyList();
    }
    default List<ConditionerEntity> findAllByHairType(String hairType){
        return Collections.emptyList();
    }
    List<ConditionerEntity> findScentById(int id);

    //List<ConditionerEntity>  getAllSize();

}
