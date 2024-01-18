package com.xworkz.amazonJpa.update;

import com.xworkz.amazonJpa.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbUpdate {
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
            findEntity.setQuantity(8);
            em.merge(findEntity);
            System.out.println("Details found and updated");
        }
        else{
            System.out.println("Can't update");
        }
        et.commit();
        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
