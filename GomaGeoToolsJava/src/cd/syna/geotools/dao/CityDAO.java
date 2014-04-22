/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cd.syna.geotools.dao;

import cd.syna.geotools.bean.City;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishka
 */
public class CityDAO extends AbstractDAO<City>{

    public CityDAO(Connection con){
        super(con);
    }

    /**
     ** ceci hérite de la super classe et permet de pouvoir ajouter les données 
     ** 
    */
    
    @Override
    public boolean add(City obj) {
        boolean b=false;
        try{
            int valeur=con.createStatement().executeUpdate("INSER INTO city VALUES "
                    + " ('" + obj.getIdcity() + "','" + obj.getIdzone() + "','" + obj.getNamecity() + "',"
                    + "'" + obj.getDesccity() + "', '" + obj.getLatcity() + "','" + obj.getLngcity() + "')"
            );
            //test if variable valeur has Values
            if(valeur==1){
                b=true;
            }else{
                b=false;
            }
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        return b;
        
    }

    @Override
    public boolean update(City obj, String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public City findById(String c) {
        City city=null;
        
        try{
            ResultSet result=this.con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * "
                    + " FROM city WHERE idcity='" + c + "'");
            
            if (result.first()){
               // city=new City(result.getString(1),result.getString(2));
            }
        }catch(SQLException es){
            es.printStackTrace();
        }
        
        return city;
    }

    @Override
    public City findByName(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<City> readAll() {
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
    
    
    
}
