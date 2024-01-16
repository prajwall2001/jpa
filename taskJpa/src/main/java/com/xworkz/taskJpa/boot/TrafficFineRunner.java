package com.xworkz.taskJpa.boot;

import com.xworkz.taskJpa.entity.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in TrafficFineRunner");

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

        TrafficFineEntity trafficFineEntity=new TrafficFineEntity(2,"Signal broken","KA20IC9090","Rohan",5500);
        em.persist(trafficFineEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Close EM,EMF");
        em.close();
        emf.close();
    }
    }

