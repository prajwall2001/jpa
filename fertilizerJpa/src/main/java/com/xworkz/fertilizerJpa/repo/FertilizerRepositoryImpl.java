package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.FertilizerEntity;
import com.xworkz.fertilizerJpa.repo.FertilizerRepository;

import javax.persistence.*;

public class FertilizerRepositoryImpl implements FertilizerRepository {
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(FertilizerEntity entity) {
        System.out.println("Starting save of FertilizerEntity:" + entity);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Starting et");
            et.begin();
            System.out.println("Starting persist");
            em.persist(entity);
            System.out.println("Persist complete");
            et.commit();
            return entity.getId();
        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in save method of Fertilizer:" + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return null;
    }
}
