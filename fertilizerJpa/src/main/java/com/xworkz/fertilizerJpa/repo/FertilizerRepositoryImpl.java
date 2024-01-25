package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.FertilizerEntity;

import javax.persistence.*;
import java.util.List;

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

    @Override
    public void saveAll(List<FertilizerEntity> list) {
        System.out.println("Starting save of fertilizer:"+list);
        EntityManager entityManager=this.emf.createEntityManager();
        EntityTransaction et=entityManager.getTransaction();
        try{
            et.begin();
            System.out.println("Begin et");
            list.forEach(e-> entityManager.persist(e));  //only entity ,list is not entity
            et.commit();
            System.out.println("save successful");
        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in saveAll..:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing resources");
            entityManager.close();
        }
        FertilizerRepository.super.saveAll(list);
    }

    @Override
    public List<FertilizerEntity> findAllByQuantity(int quantity) {
        System.out.println("findAllByQuantity with quantity:"+quantity);
        EntityManager entityManager=this.emf.createEntityManager();
        EntityTransaction et=entityManager.getTransaction();
        try{
            et.begin();
            System.out.println("Begin et");
            Query query=entityManager.createNamedQuery("findAllByQuantity");
            query.setParameter("qt",quantity);
            List<FertilizerEntity> list=query.getResultList();
            et.commit();
            System.out.println("save successful");
            return list;
        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in saveAll..:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("closing resources");
            entityManager.close();
        }
        return FertilizerRepository.super.findAllByQuantity(quantity);
    }
}
