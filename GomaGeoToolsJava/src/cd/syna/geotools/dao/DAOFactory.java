/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cd.syna.geotools.dao;

import java.sql.Connection;

/**
 *
 * @author user
 */
public class DAOFactory {
    
    protected static final Connection con=Connexion.getInstance();
    
    /**
     * Retourne des objets qui vont interagir avec la base des données
     * @return DAO
     */
    
    public static AbstractDAO getCity(){
        return new CityDAO(con);
    }
    
    public static AbstractDAO getBooking(){
        return new BookingDAO(con);
    }
    
    
    
}
