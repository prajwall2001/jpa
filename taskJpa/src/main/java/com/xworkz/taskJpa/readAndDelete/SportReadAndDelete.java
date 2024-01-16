package com.xworkz.taskJpa.readAndDelete;

import com.xworkz.taskJpa.entity.ShopsEntity;
import com.xworkz.taskJpa.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportReadAndDelete {
    public static void main(String[] args) {
        System.out.println("Invoking ToyUpdateRunner...");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        System.out.println(emf);
        EntityManager em = emf.createEntityManager();
        System.out.println("EM:" + em);

        EntityTransaction et = em.getTransaction();
        System.out.println("ET:" + et);
        et.begin();
        System.out.println("ET begins");

        SportEntity findEntity = em.find(SportEntity.class, 2);
        if (findEntity != null) {
            findEntity.setCaptainName("Rashid");
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
