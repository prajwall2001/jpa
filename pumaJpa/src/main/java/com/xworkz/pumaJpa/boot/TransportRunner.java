package com.xworkz.pumaJpa.boot;

import com.xworkz.pumaJpa.entity.TrafficEntity;
import com.xworkz.pumaJpa.entity.TransportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TransportRunner {
    public static void main(String[] args) {
        System.out.println("Invoking FilmRunner.....");

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
        EntityManager em=emf.createEntityManager();
        System.out.println("EM:"+em);

        EntityTransaction et=em.getTransaction();
        System.out.println("ET:"+et);
        et.begin();
        System.out.println("ET begins");

        System.out.println("Starting operation");
        TransportEntity transportEntity=new TransportEntity(2,"Ashok Leyland",25,140,0,"India");
        em.persist(transportEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Close EM,EMF");
        em.close();
        emf.close();
    }
}
