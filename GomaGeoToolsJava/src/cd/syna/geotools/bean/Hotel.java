package cd.syna.geotools.bean;

/**
 *
 * @author Josue
 */
public class Hotel {
    private int id;
    private  int pointofinterestid;
    private int idcity;
    private String title;
    private String type;
    private String url;
    private float latitude;
    private float longitude;
    private String adresse;
    private String deschotel;
    private int star;
    private int nbroom;
    private int nbroomdispo;
    
    private float roompricemin;
    private float roompricemax;
    private String mail;
    private String pictureurl;
             
    

public Hotel  (){
        //null constructor
    }
public Hotel (int id,int pointofinterestid,int idcity,String title,String type,String url,float latitude, float longitude, String adresse,
String deshotel,int star,int nbroom,int nbroomdispo,float roompricemin,float roompricemax,String mail,String pictureurl  ){
        this.id=id;
        this.pointofinterestid=pointofinterestid;
        this.idcity=idcity;
        this.title=title;
        this.type=type;
        this.url=url;
        this.adresse=adresse;
        this.deschotel=deshotel;
        this.latitude=latitude;
        this.longitude=longitude;
        this.mail=mail;
        this.nbroom=nbroom;
        this.nbroomdispo=nbroomdispo;
        this.pictureurl=pictureurl;
        this.roompricemax=roompricemax;
        this.roompricemin=roompricemin;
        this.star=star;
        
    }
 public Hotel (float latitude,float longitude){
        this.latitude=latitude;
        this.longitude=longitude;
    }
public int  getpointofinterestid(){
        return pointofinterestid ;
}
public void setpointofinterestid(int  pointofinterestid){
this.pointofinterestid=pointofinterestid;
}

public int getidcity(){
        return idcity ;
}

public void setidcity(int idcity){
this.idcity=idcity;
}
public String gettitle(){
        return title ;
}
public void settitle(String title){
this.title=title;
}
public String gettype(){
        return type;
} 
public void settype(String type){
this.type=type;
}
public String  geurl(){
        return url;
}
public void seturl(String url){
    this.url=url;
}
public float getlatitude(){
    return latitude;
}
public void setlatitude(float latitude){
this.latitude=latitude;
}
public float getlongitude(){
    return longitude;
}
public void setlongitude(float longitude){
this.longitude=longitude;
}
public String getadresse(){
        return adresse;
}
public void setadresse(String adresse){
this.adresse=adresse;
}
public String getdeschotel(){
        return deschotel;
} 
public void setdeschotel(String deschotel){
this.deschotel=deschotel;
}
public int  getstar(){
        return star;
}
public void setstar(int star){
this.star=star;
}
public int  getnbroom(){
        return nbroom ;
}
public void setnbroom(int nbroom){
this.nbroom=nbroom;
}
public int  getnbroomdispo(){
        return nbroomdispo ;
}
public void setnbroomdispo(int nbroomdispo){
this.nbroomdispo=nbroomdispo;
}
public float getroompricemin(){
        return roompricemin;
}
public void setroompricemin(float roompricemin){
this.roompricemin=roompricemin;
}
public float getroompricemax(){
    return roompricemax;
}
public void setroompricemax(float roompricemax){
this.roompricemax=roompricemax;
}
public String mail(){
        return mail ;
}
public void setmail(String mail){
this.mail=mail;
}
public String getpictureurl(){
        return pictureurl;
} 
public void setpictureurl (String pictureurl ){
this.pictureurl =pictureurl;
             
}





}
