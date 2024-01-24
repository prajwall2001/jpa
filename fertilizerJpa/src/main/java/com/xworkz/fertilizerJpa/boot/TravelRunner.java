package com.xworkz.fertilizerJpa.boot;

import com.xworkz.fertilizerJpa.entity.TravelEntity;
import com.xworkz.fertilizerJpa.repo.TravelRepository;
import com.xworkz.fertilizerJpa.repo.TravelRepositoryImpl;
import net.bytebuddy.asm.Advice;

import java.time.LocalDate;

public class TravelRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main");

        TravelEntity travelEntity=new TravelEntity(0,"Rajajinagar","Chamundi hills",10000,545,"Temple visit and trekking",18.50,"Car", LocalDate.of(2024,01,15),LocalDate.of(2024,01,16));
        TravelRepository repository=new TravelRepositoryImpl();
        repository.save(travelEntity);
    }
}
