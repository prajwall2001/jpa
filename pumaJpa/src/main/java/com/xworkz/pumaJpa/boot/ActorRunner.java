package com.xworkz.pumaJpa.boot;

import com.xworkz.pumaJpa.entity.ActorEntity;
import com.xworkz.pumaJpa.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ActorRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main");

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
        EntityManager em=emf.createEntityManager();
        System.out.println("EM:"+em);

        EntityTransaction et=em.getTransaction();
        System.out.println("ET:"+et);
        et.begin();
        System.out.println("ET Begins");

        //refOfEntity
        System.out.println("Starting operations");

        ActorEntity actorEntity=new ActorEntity(2,"Darshan","Rohan","Katera",55,45000000);
        em.persist(actorEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Close EM,EMF");
        em.close();
        emf.close();
    }
    }

