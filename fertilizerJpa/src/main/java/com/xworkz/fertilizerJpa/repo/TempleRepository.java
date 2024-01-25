package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.TempleEntity;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepository {

    Integer save(TempleEntity entity);


    default void saveAll(List<TempleEntity> list){

    }
    default List<TempleEntity> findAllByLocation(String name){
        return Collections.emptyList();

    }
   default List<TempleEntity> findAllByEntryFeeGreaterThan(double entryFee){
        return Collections.emptyList();
   }
  default List<TempleEntity> findAllByEntryFeeBetween(double startFee, double endFee){
        return  Collections.emptyList();
}
default List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate inaguratedDate){
    return Collections.emptyList();
}
    default List<TempleEntity> findAllByMainGodAndLocation(String mainGod, String location){
        return Collections.emptyList();
    }
default List<TempleEntity> findById(int id){
    return Collections.emptyList();

}
    default List<TempleEntity> findByIdAndMainGod(int id, String mainGod){
        return Collections.emptyList();
    }
    Long findTotal();
}
