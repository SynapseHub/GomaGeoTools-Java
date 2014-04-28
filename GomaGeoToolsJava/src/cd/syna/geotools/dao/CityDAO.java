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
            //requête sql d'insertion des données
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
    public City findById(int c) {
        City city=null;
        
        try{
            ResultSet result=this.con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * "
                    + " FROM city WHERE idcity=" + c + "");
            // Au cas ou il s'agit d'un String on utilisera cette forme ci
            //+ " FROM city WHERE idcity='" + c + "'");
            
            if (result.first()){
               city=new City(result.getInt(1),result.getInt(2),result.getString(3),
                        result.getString(4),result.getFloat(5),result.getFloat(6));
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
        ArrayList<City> data=new ArrayList<>();
        try{
            ResultSet result=this.con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM "
                    + " city ORDER by namecity");
            while (result.next()){
                data.add(new City(result.getInt(1),result.getInt(2),result.getString(3),
                        result.getString(4),result.getFloat(5),result.getFloat(6)));
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return data;
    }

    @Override
    public ArrayList readNameOnly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int c) {
        boolean r=false;
        try{
            int v=con.createStatement().executeUpdate("DELETE "
                + " FROM city WHERE idcity="+ c +"");
            if(v==1){
                r=true;
            }else{
                r=false;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return r;
    }
    
    @Override
    public boolean delete(String c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public City findById(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
