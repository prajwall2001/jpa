package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.TravelEntity;

import javax.persistence.*;

public class TravelRepositoryImpl implements TravelRepository{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(TravelEntity entity) {
        System.out.println("Starting save in TravelEntity:"+entity);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Starting et");
            et.begin();
            System.out.println("Starting persist");
            em.persist(entity);
            System.out.println("Persist complete");
            et.commit();
            return entity.getId();
        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in save method of Travel:" + pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing resources");
            em.close();
        }
        return null;
    }
}
