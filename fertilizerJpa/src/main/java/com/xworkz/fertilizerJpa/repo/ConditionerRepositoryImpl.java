package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.ConditionerEntity;
import com.xworkz.fertilizerJpa.entity.TempleEntity;
import com.xworkz.fertilizerJpa.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class ConditionerRepositoryImpl implements ConditionerRepository{
private EntityManagerFactory emf= EMFUtil.getEntityManagerFactory();
    @Override
    public Integer save(ConditionerEntity entity) {
        System.out.println("ConditionerEntity:"+entity);
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
    public void saveAll(List<ConditionerEntity> list) {
        System.out.println("Starting save of Conditioner:"+list);
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
        ConditionerRepository.super.saveAll(list);
    }

    @Override
    public void updateNetQuantityByBrand( int netQuantity,String brand) {
        System.out.println("Update Conditioner NetQuantity " +netQuantity+ " by Brand " +brand);

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();

            Query query = em.createNamedQuery("updateNetQuantityByBrand");
            query.setParameter("br", brand);
            query.setParameter("nq", netQuantity);

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

        ConditionerRepository.super.updateNetQuantityByBrand(netQuantity,brand);
    }

    @Override
    public void updateRecommendedUsesByBrand(String brand, String recommendedUses) {
        System.out.println("Update Conditioner recommendedUses " +recommendedUses+ " by Brand " +brand);

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("Begins");
            Query query = em.createNamedQuery("updateRecommendedUsesByBrand");
            query.setParameter("br", brand);
            query.setParameter("ru", recommendedUses);

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
    }

    @Override
    public List<ConditionerEntity> findAllByBrand(String brand) {
        System.out.println("FindAllBrand  of Conditioner:"+brand);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Et start");
            et.begin();
            Query query=em.createNamedQuery("findAllByBrand");
            query.setParameter("br",brand);
            List<ConditionerEntity> lists=query.getResultList();
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
        return ConditionerRepository.super.findAllByBrand(brand);
    }

    @Override
    public List<ConditionerEntity> findAllByHairType(String hairType) {
        System.out.println("FindAllByHairType  of Conditioner:"+hairType);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Et start");
            et.begin();
            Query query=em.createNamedQuery("findAllByHairType");
            query.setParameter("ht",hairType);
            List<ConditionerEntity> lists=query.getResultList();
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
        return ConditionerRepository.super.findAllByHairType(hairType);
    }

    @Override
    public List<ConditionerEntity> findScentById(int id) {
        System.out.println("FindScent of Conditioner:"+id);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Et start");
            et.begin();
            Query query=em.createNamedQuery("findScentById");
            query.setParameter("idd",id);
            List<ConditionerEntity> lists=query.getResultList();
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
        return null;
    }
}
