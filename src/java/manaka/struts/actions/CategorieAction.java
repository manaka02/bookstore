/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.actions;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateDao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import manaka.struts.modele.BaseModele;
import manaka.struts.modele.Categorie;
import manaka.struts.modele.Produit;
import manaka.struts.services.ProduitServices;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class CategorieAction  extends ActionSupport{
    private Categorie categorie;
     private int id;
    private boolean editMode = false;
    private List<Categorie> categorieList;
    
    public String index(){
        try {
            this.initListCategorie();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            return SUCCESS;
        }
    }
    
    public void initListCategorie() throws Exception{
        HibernateDao hibernate = new HibernateDao();
        List<BaseModele> baseList = hibernate.findAll(new Categorie());
        categorieList = new ArrayList<Categorie>();
        for (BaseModele baseModele : baseList) {
            categorieList.add((Categorie) baseModele);
        }
    }
    
    public String save(){
        try {     
            if(editMode){
                this.editMode = false; 
//                ProduitServices.updateProduit(categorie);
                categorie = new Categorie();
            }else{
                 new HibernateDao().save(categorie);
            }  
            this.initListCategorie();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ProduitAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
    }
    
    public String delete(){
        try {     
            new HibernateDao().delete(new Categorie(id));
            this.initListCategorie();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ProduitAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
    }
    
    public String update(){
        try {     
            this.editMode = true;
            new HibernateDao().findById(categorie);
            this.initListCategorie();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ProduitAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
    }
    public List<Categorie> getCategorieList() {
        return categorieList;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    public void setCategorieList(List<Categorie> categorieList) {
        this.categorieList = categorieList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEditMode() {
        return editMode;
    }

    public void setEditMode(boolean editMode) {
        this.editMode = editMode;
    }
    
    
    
    
}
