/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cd.syna.geotools.bean;

/**
 *
 * @author USER
 */
public class Rating {
 //   private int ratingId;
   // private double rating;
     private int ratingid;
    private int pointofinterestid;
    private int idsite;
    private float rating;
    private int date;
    
    public Rating(int ratingid,int pointofinterestid,int idsite,float rating,int date ){
        this.ratingid=ratingid;
        this.pointofinterestid=pointofinterestid;
        this.rating=rating;
        this.date=date;
    }
    public Rating(){
    }
    public int getratingid(){
        return ratingid;
    }
    public void setratingid(int ratingid){
        this.ratingid=ratingid;
    }
    public int getpointofinterestid(){
        return pointofinterestid;
    }
    public void setpointofinterestid(int pointofinterestid){
        this.pointofinterestid=pointofinterestid;
    }
    
    public int getidsite(){
        return idsite;
    }
    public void setidsite(int idsite){
        this.idsite=idsite;
    }
    public float getrating(){
        return rating;
    }
    public void setrating(float rating){
        this.rating=rating;
    }
    public int getdate(){
        return date;
    }
    public void setdate(int date){
        this.date=date;
    }
}

