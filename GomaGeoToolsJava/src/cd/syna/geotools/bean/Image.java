/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cd.syna.geotools.bean;

/**
 *
 * @author mishka
 */
public class Image {
    
    private int id;
    private int pointofinterestid;
    private String name;
    private String url;
    private String imagetype;
    
    public Image(){
        //constructeur null
    }
    
    public Image(int id, int pointofinterestid, String name, String url, String imagetype){
        this.id=id;
        this.pointofinterestid=pointofinterestid;
        this.name=name;
        this.url=url;
        this.imagetype=imagetype;
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the pointofinterestid
     */
    public int getPointofinterestid() {
        return pointofinterestid;
    }

    /**
     * @param pointofinterestid the pointofinterestid to set
     */
    public void setPointofinterestid(int pointofinterestid) {
        this.pointofinterestid = pointofinterestid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the imagetype
     */
    public String getImagetype() {
        return imagetype;
    }

    /**
     * @param imagetype the imagetype to set
     */
    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }
   
    
    
    
}
