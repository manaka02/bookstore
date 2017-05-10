/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.modele;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Categorie extends BaseModele{
    private String designation;
    private String details;

    @Override
    public String toString() {
        return "Categorie{" + "designation=" + designation + ", details=" + details + '}';
    }

    public Categorie(int id) {
        super(id);
    }

    public Categorie() {
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    
}
