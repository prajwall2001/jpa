package com.xworkz.fertilizerJpa.boot;

import com.xworkz.fertilizerJpa.entity.EmailEntity;
import com.xworkz.fertilizerJpa.repo.EmailRepository;
import com.xworkz.fertilizerJpa.repo.EmailRepositoryImpl;

import java.time.LocalDate;

public class EmailRunner {
    public static void main(String[] args) {
        System.out.println("Running in main");
        EmailEntity emailEntity=new EmailEntity(0,"@gmail","prajjuxworkz@gmail.com","hr@xworkz.in","Leave","dev2xworkz@gmail.com","aksharaxworkz@gmail.com","Due to fever not attending class", LocalDate.of(2024,05,20),true);

        EmailRepository repository=new EmailRepositoryImpl();
        repository.save(emailEntity);

    }
}
