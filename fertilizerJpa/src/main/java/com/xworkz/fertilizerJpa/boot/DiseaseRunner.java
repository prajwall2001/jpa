package com.xworkz.fertilizerJpa.boot;

import com.xworkz.fertilizerJpa.entity.DiseaseEntity;
import com.xworkz.fertilizerJpa.repo.DiseaseRepository;
import com.xworkz.fertilizerJpa.repo.DiseaseRepositoryImpl;

public class DiseaseRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main");

        DiseaseEntity entity=new DiseaseEntity(0,"Malaria","Siddaramaiyya","Fever,cold,stomach pain","Varies based on severity","Global population");
        DiseaseRepository repository=new DiseaseRepositoryImpl();
        repository.save(entity);
    }
}
