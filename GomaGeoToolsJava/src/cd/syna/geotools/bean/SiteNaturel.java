package cd.syna.geotools.bean;

/**
 *
 * @author KeeG Ekamus pro
 */
public class SiteNaturel {
    private int idsite;
    private int idcity;
    private String title;
    private String type;
    private float area;
    private String sitedesc;
    private float latitude;
    private float longitude;
    private String attracttourist;
    private float largeur;
    private float longueur;
    private String security;
    private int visitorperan;
    private String site_url_image;
    
    public SiteNaturel(){    
        //Constructeur Null
    }
    public SiteNaturel(int idsite, int idcity, String title, String type, float area, String sitedesc, float latitude, float longitude, String attracttourist, float largeur, float longueur, String security, int visitorperan, String site_url_image){
    this.idsite=idsite;
    this.idcity=idcity;
    this.title=title;
    this.type=type;
    this.area=area;
    this.sitedesc=sitedesc;
    this.latitude=latitude;
    this.longitude=longitude;
    this.attracttourist=attracttourist;
    this.largeur=largeur;
    this.security=security;
    this.visitorperan=visitorperan;
    this.site_url_image=site_url_image;
    }
    // retourne longitude et latitude de la site naturelle
    public SiteNaturel(float latitude, float longitude){
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
    public int getidsite(){
     return idsite;
    }
    public void setidsite(int idsite){
        this.idsite=idsite;
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
    public void settype(String type){
        this.type=type;
    }
    public String gettype(){
    return type;
    }
    public void setarea(float area){
    this.area=area;
    }
    public float getarea(){
    return area;
    }
    public void setsitedesc(String sitedesc){
        this.sitedesc=sitedesc;
    }
    public String getsitedesc(){
    return sitedesc;
    }
    public void setattracttourist(String attracttourist){
    this.attracttourist=attracttourist;
    }
    public String getattracttourist(){
    return attracttourist;
    }
    public void setlongueur(float longueur){
    this.longueur=longueur;
    }
    public float getlongueur(){
    return longueur;
    }
    public void setlargeur(float largeur){
    this.largeur=largeur;
    }
    public float getlargeur(){
    return largeur;
    }
    public void setsecurity(String security){
    this.security=security;
    }
    public String getsecurity(){
    return security;
    }
    public void setvisitorperan(int visitorperan){
    this.visitorperan=visitorperan;
    }
    public int getvisitorperan(){
    return visitorperan;
    }
    public void setsite_url_image(String site_url_image){
    this.site_url_image=site_url_image;
    }
    public String getsite_url_image(){
    return site_url_image;
    }
}
