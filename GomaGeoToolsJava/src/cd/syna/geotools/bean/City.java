

package cd.syna.geotools.bean;

import java.util.Vector;

/**
 *
 * @author Mishka
 */

public class City {
    
    private int idcity;
    private int idzone;
    private String namecity;
    private String desccity;
    private float latcity;
    private float lngcity;
    private String cityurlimage;
    
    private Vector<City> cityList=new Vector<>();
    
    public City(){
        //null constructor
    }
    public City(int idcity,int idzone,String namecity,String descity,float latcity, float lngcity){
        this.idcity=idcity;
        this.idzone=idzone;
        this.namecity=namecity;
        this.desccity=descity;
        this.latcity=latcity;
        this.lngcity=lngcity;
    }
    public City(float latcity,float lngcity){
        this.latcity=latcity;
        this.lngcity=lngcity;
    }

    /**
     * @return the idcity
     */
    public int getIdcity() {
        return idcity;
    }

    /**
     * @param idcity the idcity to set
     */
    public void setIdcity(int idcity) {
        this.idcity = idcity;
    }

    /**
     * @return the idzone
     */
    public int getIdzone() {
        return idzone;
    }

    /**
     * @param idzone the idzone to set
     */
    public void setIdzone(int idzone) {
        this.idzone = idzone;
    }

    /**
     * @return the namecity
     */
    public String getNamecity() {
        return namecity;
    }

    /**
     * @param namecity the namecity to set
     */
    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    /**
     * @return the desccity
     */
    public String getDesccity() {
        return desccity;
    }

    /**
     * @param desccity the desccity to set
     */
    public void setDesccity(String desccity) {
        this.desccity = desccity;
    }

    /**
     * @return the latcity
     */
    public float getLatcity() {
        return latcity;
    }

    /**
     * @param latcity the latcity to set
     */
    public void setLatcity(float latcity) {
        this.latcity = latcity;
    }

    /**
     * @return the lngcity
     */
    public float getLngcity() {
        return lngcity;
    }

    /**
     * @param lngcity the lngcity to set
     */
    public void setLngcity(float lngcity) {
        this.lngcity = lngcity;
    }

    /**
     * @return the cityurlimage
     */
    public String getCityurlimage() {
        return cityurlimage;
    }

    /**
     * @param cityurlimage the cityurlimage to set
     */
    public void setCityurlimage(String cityurlimage) {
        this.cityurlimage = cityurlimage;
    }
    
    public Vector<City> getCityList(){
        return cityList;
    }
    
    
    
}
