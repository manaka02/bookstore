
import dao.HibernateDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import manaka.struts.modele.BaseModele;
import manaka.struts.modele.Categorie;
import manaka.struts.modele.Genre;
import manaka.struts.modele.Produit;
import manaka.struts.services.ProduitServices;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toavina RALAMBOSOA
 */
public class Main {
    public static void main(String[] data){
        try {
            HibernateDao hibernate = new HibernateDao();
            
            Genre p = new Genre();
            
            double number = hibernate.getNumberOfRow(p);
            System.out.println("number of genre :" + number);
//            List<BaseModele> genreList = hibernate.findWithPagination(p, 2,10);
//            for (BaseModele baseModele : genreList) {
//                Genre g = (Genre) baseModele;
//                System.out.println(g.getDesignation());
//            }
            
            
        }catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public void createAndStoreUser(String nom){
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        
//        Utilisateur user = new Utilisateur();
//        user.setMail(nom + "@gmail.com");
//        user.setNom(nom);
//        user.setPass(nom+"123456");
//        session.save(user);
//        session.getTransaction().commit();
//    }
    
//    private List<BaseModele> list(BaseModele baseModele) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        List result = session.createQuery("from "+ baseModele.getClass().getSimpleName()).list();
//        session.getTransaction().commit();
//        return result;
//    }
//    
//    private void addTacheToUser(int idTache, int idUser){
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        Utilisateur aPerson = (Utilisateur) session.load(Utilisateur.class, idTache);
//        Tache aTache = (Tache) session.load(Tache.class, idTache);
//        aTache.getUtilisateurs().add(aPerson);
//        
//        session.getTransaction().commit();
//    }
}
