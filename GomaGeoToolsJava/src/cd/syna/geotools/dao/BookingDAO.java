
package cd.syna.geotools.dao;

import cd.syna.geotools.bean.Booking;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author mishka
 */
public class BookingDAO extends AbstractDAO<Booking>{

    public BookingDAO(Connection con){
        super(con);
    }
    
    @Override
    public boolean add(Booking obj) {
        boolean r=false;
        try{
            int values=con.createStatement().executeUpdate("INSERT "
                + "INTO booking VALUES ('" + obj.getBookingid() + "', "
                + "'" + obj.getIdcity() +"', '" + obj.getBookingdesc() + "', '" + obj.getDatetrip() + "',"
                + "'" + obj.getDuration() + "', '" + obj.getPaymentmode() + "', '" + obj.getBookingdate() + "',"
                + "'" + obj.getUserid() + "', '" + obj.getCourtierid() + "', '" + obj.getPointofinterestid() + "',"
                + "'" + obj.getIdsite() + "')");
            if(values==1){
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
    public boolean update(Booking obj, String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Booking findById(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Booking findById(int c) {
        Booking booking=null;
        
        try{
            ResultSet result=this.con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(
                            "SELECT * FROM booking WHERE bookingid =" + c + ""
                    );
            if(result.first()){
                booking=new Booking(result.getInt(1),result.getInt(2),
                        result.getString(3),result.getString(4),result.getInt(5),
                        result.getString(6),result.getString(7)
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return booking;
    }

    @Override
    public Booking findByName(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Booking> readAll() {
        ArrayList<Booking> data=new ArrayList<>();
        try{
            ResultSet result=this.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
                    .executeQuery("SELECT * FROM booking ORDER BY idcity");
            while (result.next()){
                data.add(new Booking(result.getInt(1),result.getInt(2),
                        result.getString(3),result.getString(4),result.getInt(5),
                        result.getString(6),result.getString(7)));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return data;
    }

    @Override
    public ArrayList readNameOnly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Méthode qui permet de supprimer les données de la table
     * @param c : booking id
     * @return boolean : vrai ou faux
     */
    @Override
    public boolean delete(int c) {
        boolean r=false;
        String sql="DELETE FROM booking WHERE bookingid=" + c;
        try{
            int v=con.createStatement().executeUpdate(sql);
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
    
}
