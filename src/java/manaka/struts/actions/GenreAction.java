/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manaka.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateDao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import manaka.struts.modele.BaseModele;
import manaka.struts.modele.Categorie;
import manaka.struts.modele.Genre;

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class GenreAction extends ActionSupport{
    private Genre genre;
    private int id;
    private int numpage = 0;
    private double rownumber = 0;
    private int numberByPage = 5;
    private boolean editMode = false;
    private List<Genre> genreList;
    
    public String index(){
        try {
            this.initListGenre();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            return SUCCESS;
        }
    }
    
    public void initListGenre() throws Exception{
        
        HibernateDao hibernate = new HibernateDao();
        this.rownumber = hibernate.getNumberOfRow(new Genre());
        if(numpage<0) numpage = 0;
        if(numpage>(int)(rownumber/numberByPage)+1) numpage = (int)(rownumber/numberByPage)+1;
        List<BaseModele> baseList = hibernate.findWithPagination(new Genre(),numpage, 5, "designation");
        genreList = new ArrayList<Genre>();
        for (BaseModele baseModele : baseList) {
            genreList.add((Genre) baseModele);
        }
    }
    
     public String save(){
        try {     
            if(editMode){
                this.editMode = false; 
//                ProduitServices.updateProduit(categorie);
                genre = new Genre();
            }else{
                 new HibernateDao().save(genre);
            }  
            this.initListGenre();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ProduitAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
    }
    
    public String delete(){
        try {     
            new HibernateDao().delete(new Genre(id));
            this.initListGenre();
            return SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ProduitAction.class.getName()).log(Level.SEVERE, null, ex);
            return ERROR;
        }
    }
    public int getNumberByPage() {
        return numberByPage;
    }

    public void setNumberByPage(int numberByPage) {
        this.numberByPage = numberByPage;
    }
    
    
    public Genre getGenre() {
        return genre;
    }

    public int getNumpage() {
        return numpage;
    }

    public void setNumpage(int numpage) {
        this.numpage = numpage;
    }

    public double getRownumber() {
        return rownumber;
    }

    public void setRownumber(double rownumber) {
        this.rownumber = rownumber;
    }
    
    

    public void setGenre(Genre genre) {
        this.genre = genre;
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

    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    
    
}
