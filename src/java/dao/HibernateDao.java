/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import manaka.struts.modele.BaseModele;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import org.hibernate.criterion.Restrictions;
import manaka.struts.utils.HibernateUtil;
/**
 *
 * @author Toavina RALAMBOSOA
 */
public class HibernateDao {
    

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public void save(BaseModele obj) throws Exception{
        Session session = null;
        Transaction tr=null;
        try{
            session = getSessionFactory().openSession();
            tr=session.beginTransaction();
            session.save(obj);
            tr.commit();
        }catch (Exception ex){
            if(tr!=null)
                tr.rollback();
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }

    public void findById(BaseModele obj) throws Exception{
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            session.load(obj,obj.getId());
        }catch (Exception ex){
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }
    
    public List<BaseModele> findAllWithCondition(BaseModele obj)  throws Exception{
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(obj.getClass()).add(Restrictions.isNull("idParent"));;
            return criteria.list();
        }catch (Exception ex){
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }
    public List<BaseModele> findAll(BaseModele obj)  throws Exception{
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(obj.getClass());
            return criteria.list();
        }catch (Exception ex){
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }
    
    public List<BaseModele> findAllWithCondition(BaseModele obj, String condition, int value)  throws Exception{
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            
            Criteria criteria = session.createCriteria(obj.getClass()).add(Restrictions.eq(condition, value));
            return criteria.list();
        }catch (Exception ex){
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }

    public void update(BaseModele obj)   throws Exception{
        System.out.println(obj.toString());
        Session session = null;
        Transaction tr=null;
        try{
            session = getSessionFactory().openSession();
            tr=session.beginTransaction();
            session.update(obj);
            tr.commit();
        }catch (Exception ex){
            if(tr!=null)
                tr.rollback();
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }
    
    public void delete(BaseModele obj){
         Session session = null;
        Transaction tr=null;
        try {
            session = getSessionFactory().openSession();
            tr=session.beginTransaction();
            session.delete(obj);
            tr.commit();
        } catch (Exception ex){
            if(tr!=null)
                tr.rollback();
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }
}


