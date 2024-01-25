package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.FertilizerEntity;

import java.util.Collections;
import java.util.List;

public interface FertilizerRepository {
    Integer save(FertilizerEntity entity);

    default void saveAll(List<FertilizerEntity> list){

    }
    default List<FertilizerEntity> findAllByQuantity(int quantity){
        return Collections.emptyList();

    }

}
