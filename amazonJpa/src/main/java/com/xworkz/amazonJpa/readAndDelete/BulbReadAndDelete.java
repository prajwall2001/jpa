package com.xworkz.amazonJpa.readAndDelete;

import com.xworkz.amazonJpa.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbReadAndDelete {
    public static void main(String[] args) {
        System.out.println("Invoking main...");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
        EntityManager em = emf.createEntityManager();
        System.out.println("EM:" + em);

        EntityTransaction et = em.getTransaction();
        System.out.println("ET:" + et);
        et.begin();
        System.out.println("ET begins");

        BulbEntity findEntity = em.find(BulbEntity.class, 2);
        if (findEntity != null) {
            em.remove(findEntity);
            System.out.println("Details found and deleted");
        }
        else{
            System.out.println("Can't delete");
        }
        et.commit();
        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
