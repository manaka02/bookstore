/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import manaka.struts.modele.Auteur;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class AuteurAction   extends ActionSupport{
    private Auteur categorie;
     private int id;
    private boolean editMode = false;
    private List<Auteur> categorieList;

    public Auteur getCategorie() {
        return categorie;
    }

    public void setCategorie(Auteur categorie) {
        this.categorie = categorie;
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

    public List<Auteur> getCategorieList() {
        return categorieList;
    }

    public void setCategorieList(List<Auteur> categorieList) {
        this.categorieList = categorieList;
    }
    
    
    
}
