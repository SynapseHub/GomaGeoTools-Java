package cd.syna.geotools.dao;
import cd.syna.geotools.bean.Restaurant;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author KeeG Ekamus pro
 */
public class RestaurantDAO extends AbstractDAO <Restaurant>  {

    public  RestaurantDAO(Connection  v){

    super(v);
}
    @Override
    public boolean add(Restaurant obj) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Restaurant obj, String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Restaurant findById(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Restaurant findByName(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Restaurant> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList readNameOnly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Restaurant findById(int c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(int c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
