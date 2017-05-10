/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import manaka.struts.modele.Livre;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class LivreAction  extends ActionSupport{
    private Livre livre;
    
    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }
    
    
    
    
}
