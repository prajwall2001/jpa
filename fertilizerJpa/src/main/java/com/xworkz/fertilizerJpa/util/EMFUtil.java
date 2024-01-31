package com.xworkz.fertilizerJpa.util;

import lombok.Getter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
    @Getter
    private static EntityManagerFactory entityManagerFactory;//static for not craeting instance ,private for encapsulation

    static{
        entityManagerFactory= Persistence.createEntityManagerFactory("x-workz");
        System.out.println("Creating entityManagerFactory in EMFUtil");
    }
}
