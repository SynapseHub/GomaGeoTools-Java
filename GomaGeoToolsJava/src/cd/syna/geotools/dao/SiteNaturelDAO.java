package cd.syna.geotools.dao;

/**
 *
 * @author KeeG Ekamus pro
 */

import cd.syna.geotools.bean.SiteNaturel;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author KeeG Ekamus pro
 */
public class SiteNaturelDAO extends AbstractDAO <SiteNaturel>  {

    public SiteNaturelDAO (Connection k){
        super(k);
    }

    @Override
    public boolean add(SiteNaturel obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SiteNaturel obj, String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SiteNaturel findById(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SiteNaturel findByName(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SiteNaturel> readAll() {
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
    public SiteNaturel findById(int c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(int c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
