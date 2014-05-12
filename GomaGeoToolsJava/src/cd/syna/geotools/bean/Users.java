/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd.syna.geotools.bean;

/**
 *
 * @author Bernadette PALILA
 */
public class Users {

    private int userid;
    private String usern;
    private String pswd;
    private String type_acc;
    private String email;
    private char title;
    private String lastname;
    private String firstname;
    private String website;
    private String city;
    private String country;
    private String compagny;
    private String phone;
    private String biography;
    private int Uid;

    public Users() {
        //constructeur null
    }

    public Users(int userid, String usern, String pswd, String type_acc, String email, char title, String lastname, String firstname, String website, String city, String country, String compagny, String phone, String biography, int Uid) {

        this.userid = userid;
        this.usern = usern;
        this.pswd = pswd;
        this.type_acc = type_acc;
        this.email = email;
        this.title = title;
        this.lastname = lastname;
        this.firstname = firstname;
        this.website = website;
        this.city = city;
        this.country = country;
        this.compagny = compagny;
        this.phone = phone;
        this.biography = biography;
        this.Uid = Uid;
    }

    public Users(String type_acc, String usern, String pswd) {
        this.type_acc = type_acc;
        this.usern = usern;
        this.pswd = pswd;
    }

    /**
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * @return the usern
     */
    public String getUsern() {
        return usern;
    }

    /**
     * @param usern the usern to set
     */
    public void setUsern(String usern) {
        this.usern = usern;
    }

    /**
     * @return the pswd
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * @param pswd the pswd to set
     */
    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    /**
     * @return the type_acc
     */
    public String getType_acc() {
        return type_acc;
    }

    /**
     * @param type_acc the type_acc to set
     */
    public void setType_acc(String type_acc) {
        this.type_acc = type_acc;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the title
     */
    public char getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(char title) {
        this.title = title;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return the city
     */
    public String getCityname() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCityname(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountryname() {
        return country;
    }

    /**
     * @param county the country to set
     */
    public void setCountryname(String country) {
        this.country = country;
    }

    /**
     * @return the compagny
     */
    public String getCompagnyname() {
        return compagny;
    }

    /**
     * @param compagny the compagny to set
     */
    public void setCompagnyname(String compagny) {
        this.compagny = compagny;
    }

    /**
     * @return the phone
     */
    public String getPhonenumber() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhonenumber(String phone) {
        this.phone = phone;
    }

    /**
     * @return the biography
     */
    public String getBiography() {
        return biography;
    }

    /**
     * @param biography the biography to set
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }

    /**
     * @return the Uid
     */
    public int getUid() {
        return Uid;
    }

    /**
     * @param Uid the Uid to set
     */
    public void setUid(int Uid) {
        this.Uid = Uid;
    }
}
