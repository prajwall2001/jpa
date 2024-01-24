package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.EmailEntity;

import javax.persistence.*;

public class EmailRepositoryImpl implements EmailRepository{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(EmailEntity entity) {
        System.out.println("Starting save in EmailEntity:"+entity);
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
            System.out.println("PersistenceException in save method of Email:"+pe.getMessage());
            et.rollback();
        }
        finally{
            System.out.println("Closing resource");
            em.close();
        }
        return null;
    }
}
