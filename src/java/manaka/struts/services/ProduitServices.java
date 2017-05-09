/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.services;

import dao.HibernateDao;
import java.util.ArrayList;
import java.util.List;
import manaka.struts.modele.BaseModele;
import manaka.struts.modele.Produit;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class ProduitServices {
    public static List<Produit> getAllProduit() throws Exception{
        List<Produit> produitList = new ArrayList<Produit>();
        HibernateDao hibernate = new HibernateDao();
        List<BaseModele> produitBase = hibernate.findAll(new Produit());
        for (BaseModele baseModele : produitBase) {
            produitList.add((Produit) baseModele);
        }
        return produitList;
    }
    
    public static void insertProduit(Produit p) throws Exception{
        HibernateDao hibernate = new HibernateDao();
        hibernate.save(p);
    }
    
    public static Produit getOneProduit(Produit p) throws Exception{
        HibernateDao hibernate = new HibernateDao();
        hibernate.findById(p);
        
        return p;
    }
    
    public static void deleteProduit(Produit p){
        HibernateDao hibernate = new HibernateDao();
        hibernate.delete(p);
    }
    
    public static void updateProduit(Produit p) throws Exception{
        HibernateDao hibernate = new HibernateDao();
        hibernate.update(p);
    }
}
