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
public class BaseModele {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaseModele(int id) {
        this.id = id;
    }

    public BaseModele() {
    }
    
    
}
