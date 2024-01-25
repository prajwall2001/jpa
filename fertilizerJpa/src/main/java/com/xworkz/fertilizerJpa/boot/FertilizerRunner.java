package com.xworkz.fertilizerJpa.boot;

import com.xworkz.fertilizerJpa.entity.FertilizerEntity;
import com.xworkz.fertilizerJpa.repo.FertilizerRepository;
import com.xworkz.fertilizerJpa.repo.FertilizerRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FertilizerRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main");
//        FertilizerEntity entity=new FertilizerEntity("Pottasium",5,250.00, LocalDate.of(2024,01,01),LocalDate.of(2024,06,02));
//        FertilizerEntity entity1=new FertilizerEntity("Urea",10,450.00, LocalDate.of(2023,01,01),LocalDate.of(2026,02,28));
//        FertilizerEntity entity2=new FertilizerEntity("DGT",7,750.00, LocalDate.of(2021,07,05),LocalDate.of(2024,04,22));
//        FertilizerEntity entity3=new FertilizerEntity("Sulphide",8,200.00, LocalDate.of(2023,9,22),LocalDate.of(2026,07,02));
//        FertilizerEntity entity4=new FertilizerEntity("Nitrogen",15,300.00, LocalDate.of(2022,8,18),LocalDate.of(2024,9,22));
       FertilizerRepository repo=new FertilizerRepositoryImpl();
    //    List<FertilizerEntity> entities= Arrays.asList(entity,entity1,entity2,entity3,entity4);
       // repo.saveAll(entities);


       List<FertilizerEntity> list= repo.findAllByQuantity(10);
       repo.saveAll(list);

    }
}
