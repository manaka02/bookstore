/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import manaka.struts.modele.Produit;
import manaka.struts.services.ProduitServices;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class ProduitAction extends ActionSupport{
    private Produit produit = new Produit();
    private List<Produit> produitList;
    private int id;
    private boolean editMode = false;
    
    public String index(){
        try {
            
            produitList = ProduitServices.getAllProduit();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ProduitAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
    }
    
    public String save(){
        try {     
            if(editMode){
                this.editMode = false; 
                ProduitServices.updateProduit(produit);
                produit = new Produit();
            }else{
                ProduitServices.insertProduit(this.produit);      
            }  
            produitList = ProduitServices.getAllProduit();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ProduitAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
    }
    
    public String delete(){
        try {     
            ProduitServices.deleteProduit(new Produit(id));
            produitList = ProduitServices.getAllProduit();
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
            produit = ProduitServices.getOneProduit(new Produit(id));
            produitList = ProduitServices.getAllProduit();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ProduitAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
    }

    public boolean isEditMode() {
        return editMode;
    }

    public void setEditMode(boolean editMode) {
        this.editMode = editMode;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }
    
    
    
    
}
