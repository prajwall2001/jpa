package com.xworkz.pumaJpa.boot;

import com.xworkz.pumaJpa.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaRunner {
    public static void main(String[] args) {
        System.out.println("Invoking JpaRunner........");

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
        EntityManager em=emf.createEntityManager();
        System.out.println("EM:"+em);

        EntityTransaction et=em.getTransaction();
        System.out.println("ET:"+et);
        et.begin();
        System.out.println("ET Begins");

        //refOfEntity
        System.out.println("Starting operations");
        SuperHeroEntity superHeroEntity=new SuperHeroEntity(2,"Tom Hiddleston","Loki","Tele-portation","NewZealand","Water");
        SuperHeroEntity superHeroEntity1=new SuperHeroEntity(3,"Tom Hiddleston","Loki2","Tele-portation","NewZeland","Air");

        em.persist(superHeroEntity1);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Close EM,EMF");
        em.close();
        emf.close();
    }
}
