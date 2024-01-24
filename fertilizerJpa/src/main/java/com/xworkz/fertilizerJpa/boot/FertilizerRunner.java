package com.xworkz.fertilizerJpa.boot;

import com.xworkz.fertilizerJpa.entity.FertilizerEntity;
import com.xworkz.fertilizerJpa.repo.FertilizerRepository;
import com.xworkz.fertilizerJpa.repo.FertilizerRepositoryImpl;

import java.time.LocalDate;

public class FertilizerRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main");
        FertilizerEntity ref=new FertilizerEntity(0,"Pottasium",5,250.00, LocalDate.of(2024,01,01),LocalDate.of(2024,06,02));
        FertilizerRepository repo=new FertilizerRepositoryImpl();
        repo.save(ref);
    }
}
