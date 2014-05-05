package cd.syna.geotools.bean;

/**
 *
 * @author KeeG Emerykamus pro
 */
public class Restaurant {
    private int pointofinterestid;
    private int idcity;
    private String title;
    private String url;
    private String classification;
    private float latitude;
    private float longitude;
    private String description;
    private String mealofday;
    private String mealprice;
    private String pictureurl;
    
    public Restaurant(){    
        //constructeur null
    }
    
    public Restaurant(int pointofinterestid, int idcity, String title, String url, String description, String mealofday, String mealprice, String pictureurl){
    this.pointofinterestid=pointofinterestid;
    this.idcity=idcity;
    this.title=title;
    this.url=url;
    this.description=description;
    this.latitude=latitude;
    this.longitude=longitude;
    this.mealofday=mealofday;
    this.mealprice=mealprice;
    this.pictureurl=pictureurl;
    this.classification=classification;
    }
    // retourne longitude et latitude du restaurant
    public Restaurant(float latitude, float longitude){
        this.latitude=latitude;
        this.longitude=longitude;
    }
   
    public void setlatitude(float latitude){
    this.latitude=latitude;
    }
    public float getlatitude(){
     return latitude;
    }
    public void setlongitude(float longitude){
    this.longitude=longitude;
    }
    public float getlongitude(){
     return longitude;
    }
    // retourne idsite saisi et l'affiche
    public void setpointofinterestid(int pointofinterestid){
    this.pointofinterestid=pointofinterestid;
    }
    public int getpointofinterestid(){
     return pointofinterestid;
    }
    // retourne idcity
    public int getIdcity() {
        return idcity;
    }
    // retourne idcity
    public void setIdcity(int idcity) {
        this.idcity = idcity;
    }
    public void settitle(String title){
        this.title=title;
    }
    public String gettitle(){
        return title;
    }
    public void seturl(String url){
        this.url=url;
    }
    public String geturl(){
    return url;
    }
    public void setclassification(String classification){
    this.classification=classification;
    }
    public String getclassification(){
    return classification;
    }
    public void setdescription(String description){
        this.description=description;
    }
    public String getdescription(){
    return description;
    }
    public void setmealofday(String mealofday){
    this.mealofday=mealofday;
    }
    public String mealofday(){
    return mealofday;
    }
    public void setmealprice(String mealprice){
    this.mealprice=mealprice;
    }
    public String getmealprice(){
    return mealprice;
    }
    public void setpictureurl(String pictureurl){
    this.pictureurl=pictureurl;
    }
    public String getpictureurl(){
    return pictureurl;
    }
    
}
