package com.xworkz.taskJpa.boot;

import com.xworkz.taskJpa.entity.ShopsEntity;
import com.xworkz.taskJpa.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in ShopsRunner");

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

        SportEntity sportEntity=new SportEntity(2,"Kabaddi","Bangladesh","Mujeeb",7);
        em.persist(sportEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        System.out.println("Close EM,EMF");
        em.close();
        emf.close();
    }
}
