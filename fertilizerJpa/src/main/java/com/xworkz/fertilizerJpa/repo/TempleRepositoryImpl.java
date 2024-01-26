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

    @Override
    public TempleEntity findTempleByMaxEntryFee() {
        System.out.println("Finding temple with maximum entry fee");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("Transaction begin");
            et.begin();

            Query query = em.createNamedQuery("findTempleByMaxEntryFee");
            TempleEntity temple = (TempleEntity) query.getSingleResult();

            et.commit();
            System.out.println("Transaction commit");

            return temple;
        }
           catch(PersistenceException pe){
                System.out.println("Persistence Exception:"+pe.getMessage());
                et.rollback();
            }
           finally {
                System.out.println("Closing resources");
                em.close();
            }
            return null;
    }

    @Override
    public void updateLocationByName(String location, String name) {
        System.out.println("Update temple location " +location+ " by Name " +name);

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();

            Query query = em.createNamedQuery("updateLocationByName");
            query.setParameter("loc", location);
            query.setParameter("nm", name);

           int rowsUpdated = query.executeUpdate();

            et.commit();
            System.out.println("Transaction commit. Rows updated: " + rowsUpdated);

        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        TempleRepository.super.updateLocationByName(location, name);
    }

    @Override
    public void updateEntryFeeByName(double entryFee, String name) {
        System.out.println("Update temple EntryFee " +entryFee+ " by Name " +name);

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();

            Query query = em.createNamedQuery("updateEntryFeeByName");
            query.setParameter("ef", entryFee);
            query.setParameter("nam", name);

            int rowsUpdated = query.executeUpdate();

            et.commit();
            System.out.println("Transaction commit. Rows updated: " + rowsUpdated);

        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        TempleRepository.super.updateEntryFeeByName(entryFee, name);
    }

    @Override
    public void updateLocationAndDimensionById(String location, double dimension, int id) {
        System.out.println("Update temple Location and Dimension by id: " +id);

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();

            Query query = em.createNamedQuery("updateLocationAndDimensionById");
            query.setParameter("lo", location);
            query.setParameter("dm", dimension);
            query.setParameter("i",id);

            int rowsUpdated = query.executeUpdate();

            et.commit();
            System.out.println("Transaction commit. Rows updated: " + rowsUpdated);

        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        TempleRepository.super.updateLocationAndDimensionById(location, dimension, id);
    }

    @Override
    public void deleteByName(String name) {
        System.out.println("Deleting temple by name: " + name);

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            Query query = em.createNamedQuery("deleteByName");
            query.setParameter("nm", name);

            int rowsDeleted = query.executeUpdate();

            et.commit();
            System.out.println("Transaction committed. Rows deleted: " + rowsDeleted);
        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
    }

    @Override
    public void updateAllVipEntryFee(boolean entryFee, List<Integer> id) {
        System.out.println("EntryFee: " + entryFee);

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            Query query = em.createNamedQuery("updateAllVipEntryFee");
            query.setParameter("entf", entryFee);
            query.setParameter("ids",id);

            int rowsDeleted = query.executeUpdate();

            et.commit();
            System.out.println("Transaction committed. Rows deleted: " + rowsDeleted);
        } catch (PersistenceException pe) {
            System.out.println("Persistence Exception: " + pe.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
    }
}
