/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.modele;

import java.io.Serializable;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Produit extends BaseModele implements Serializable{
    private String reference;
    private String designation;
    private int prix;
    private int quantite;
    private boolean promo;

    public Produit() {
    }

    public Produit(int id) {
        super(id);
    }
    
    @Override
    public String toString() {
        return "Produit{" + "reference=" + reference + ", designatin=" + designation + ", prix=" + prix + ", quantite=" + quantite + ", promo=" + promo + '}';
    }

    public Produit(String reference, String designatin, int prix, int quantite, boolean promo) {
        this.reference = reference;
        this.designation = designatin;
        this.prix = prix;
        this.quantite = quantite;
        this.promo = promo;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designatin) {
        this.designation = designatin;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }
    
    
    
     
    
}
