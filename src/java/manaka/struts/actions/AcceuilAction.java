/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateDao;
import java.util.List;
import manaka.struts.modele.*;
/**
 *
 * @author Toavina RALAMBOSOA
 */
public class AcceuilAction   extends ActionSupport{
    private List<Categorie> categorieList;
    private List<Auteur> auteurList;
    private List<Livre> livreList; //les nouveautés
    private List<Livre> bestSeller; //les plus aimées
    
    public String index(){
        try {
            this.initAcceuil();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            return SUCCESS;
        }
    }
    
    public void initAcceuil() throws Exception{
         HibernateDao hibernate = new HibernateDao();
        List<BaseModele> baseList = hibernate.findAll(new Categorie());
        
    }

    public List<Categorie> getCategorieList() {
        return categorieList;
    }

    public void setCategorieList(List<Categorie> categorieList) {
        this.categorieList = categorieList;
    }

    public List<Auteur> getAuteurList() {
        return auteurList;
    }

    public void setAuteurList(List<Auteur> auteurList) {
        this.auteurList = auteurList;
    }

    public List<Livre> getLivreList() {
        return livreList;
    }

    public void setLivreList(List<Livre> livreList) {
        this.livreList = livreList;
    }

    public List<Livre> getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(List<Livre> bestSeller) {
        this.bestSeller = bestSeller;
    }
    
    
}
