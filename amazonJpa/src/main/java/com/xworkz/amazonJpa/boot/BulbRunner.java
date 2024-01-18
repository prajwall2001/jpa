package com.xworkz.amazonJpa.boot;

import com.xworkz.amazonJpa.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbRunner {
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

        //BulbEntity bulbEntity = new BulbEntity(1, "Panasonic", "LED", "Smart Bulb", "10W", "Round", "E27", "60W", "White", "220V", 5);
        BulbEntity bulbEntity1 = new BulbEntity(2, "ABC", "CFL", "Energy Saver", "15W", "Spiral", "E14", "75W", "Warm White", "240V", 3);
        em.persist(bulbEntity1);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Close EM,EMF");
        em.close();
        emf.close();
    }
    }

