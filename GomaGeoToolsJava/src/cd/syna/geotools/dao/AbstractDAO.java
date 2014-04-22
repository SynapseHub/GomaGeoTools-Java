
package cd.syna.geotools.dao;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Mishka
 */
public abstract class AbstractDAO<T> {
    
    protected Connection con=null;
    
    public AbstractDAO(Connection con){
        this.con=con;
    }
    
    /**
     * ceci va ajouter un objet dans la base des donnees
     * 
     * @param obj : c'est l'objet à insérer
     * @return boolean : vrai ou faux
     */
    
    public abstract boolean add(T obj);
    public abstract boolean update(T obj, String c);
    
    /**
     * Recherche un objet dans la BD
     * 
     * @param obj: peut eutre soit le dod ou Id
     * @return T : un objet de la BD
     */
    
    public abstract T findById(String c);
    public abstract T findByName(String c);
    public abstract ArrayList<T> readAll();
    public abstract ArrayList readNameOnly();
    public abstract boolean delete(String c);
    //public abstract String checkGenerateKey(String key, String tab, String ch);
    
}
