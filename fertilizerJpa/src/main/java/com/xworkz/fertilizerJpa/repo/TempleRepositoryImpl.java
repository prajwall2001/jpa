package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.TempleEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class TempleRepositoryImpl implements TempleRepository{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(TempleEntity entity) {
        System.out.println("Temple entity:"+entity);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("Et begin");
            em.persist(entity);
            System.out.println("Persist complete");
            et.commit();
            return entity.getId();

        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in save:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing resources");
            em.close();
        }
        return null;
    }

    @Override
    public void saveAll(List<TempleEntity> list) {
        System.out.println("Starting save of temple:"+list);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("Et begin");
            list.forEach(e->em.persist(e));
            et.commit();
            System.out.println("Save success");
        }
        catch(PersistenceException pe){
            System.out.println("PersistenceException in save:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing resourecs");
            em.close();
        }
        TempleRepository.super.saveAll(list);
    }

    @Override
    public List<TempleEntity> findAllByLocation(String name) {
        System.out.println("FindAll by Location using name  of temple:"+name);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Et start");
            et.begin();
            Query query=em.createNamedQuery("findAllByLocation");
            query.setParameter("nm",name);
            List<TempleEntity> lists=query.getResultList();
            et.commit();
            System.out.println("commit success");
            return lists;
        }
        catch(PersistenceException pe){
            System.out.println("Persistence Exception:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing resources");
            em.close();
        }
        return TempleRepository.super.findAllByLocation(name);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(double entryFee) {
        System.out.println("FindAll by EntryFee greater than:"+entryFee);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("Et start");
            et.begin();
            Query query = em.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("fee", entryFee);
            List<TempleEntity> resultList = query.getResultList();
            et.commit();
            System.out.println("Commit success");
            return resultList;
        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return TempleRepository.super.findAllByEntryFeeGreaterThan(entryFee);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(double startFee, double endFee) {
        System.out.println("FindAll by EntryFee between than:"+startFee+ "and "+endFee);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("Et start");
            et.begin();
            Query query = em.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("startFee",startFee);
            query.setParameter("endFee",endFee);
            List<TempleEntity> resultList = query.getResultList();
            et.commit();
            System.out.println("Commit success");
            return resultList;
        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return TempleRepository.super.findAllByEntryFeeBetween(startFee, endFee);
    }


    @Override
    public List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate inaguratedDate) {
        System.out.println("FindAll by inaguratedDate greater than:"+inaguratedDate);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("Et start");
            et.begin();
            Query query = em.createNamedQuery("findAllByInaguratedDateGreaterThan");
            query.setParameter("ing", inaguratedDate);
            List<TempleEntity> resultList = query.getResultList();
            et.commit();
            System.out.println("Commit success");
            return resultList;
        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return TempleRepository.super.findAllByInaguratedDateGreaterThan(inaguratedDate);
    }
    @Override
    public List<TempleEntity> findAllByMainGodAndLocation(String mainGod, String location) {
             EntityManager em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            try {
                et.begin();
                Query query = em.createNamedQuery("findAllByMainGodAndLocation");
                query.setParameter("mg", mainGod);
                query.setParameter("lc", location);
                List<TempleEntity> resultList = query.getResultList();
                et.commit();
                return resultList;
            } catch (PersistenceException pe) {
              System.out.println("Persistence Exception: " + pe.getMessage());
               et.rollback();
        }
      return TempleRepository.super.findAllByMainGodAndLocation(mainGod, location);
     }


    @Override
    public List<TempleEntity> findById(int id) {
        System.out.println("FindAll by id using Id  of temple:"+id);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Et start");
            et.begin();
            Query query=em.createNamedQuery("findAllById");
            query.setParameter("idd",id);
            List<TempleEntity> lists=query.getResultList();
            et.commit();
            System.out.println("commit success");
            return lists;
        }
        catch(PersistenceException pe){
            System.out.println("Persistence Exception:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing resources");
            em.close();
        }

        return TempleRepository.super.findById(id);
    }

    @Override
    public List<TempleEntity> findByIdAndMainGod(int id, String mainGod) {
        System.out.println("FindAll by id using Id of temple "+id+ " and" +mainGod);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("Et start");
            et.begin();
            Query query = em.createNamedQuery("findByIdAndMainGod");
            query.setParameter("idd", id);
            query.setParameter("mainGodd", mainGod);
            List<TempleEntity> resultList = query.getResultList();
            et.commit();
            System.out.println("Commit success");
            return resultList;
        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return TempleRepository.super.findByIdAndMainGod(id, mainGod);
    }

    @Override
    public Long findTotal() {
        System.out.println("Finding total number of temples");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("Transaction begin");
            et.begin();

            Query query = em.createNamedQuery("findTotal");
            Long total = (Long) query.getSingleResult();

            et.commit();
            System.out.println("Transaction commit");

            return total;

        }catch(PersistenceException pe){
            System.out.println("Persistence Exception:"+pe.getMessage());
            et.rollback();
        }
finally {
            System.out.println("Closing resources");
            em.close();
        }
        return null;
    }
}
