/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.modele;

import java.sql.Date;


/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Livre extends BaseModele{
    private String designation;
    private Date dateparution;
    private String synopsis;
    private Date dateajout;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateparution() {
        return dateparution;
    }

    public void setDateparution(Date dateparution) {
        this.dateparution = dateparution;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateajout() {
        return dateajout;
    }

    public void setDateajout(Date dateajout) {
        this.dateajout = dateajout;
    }
    
    
    
}
