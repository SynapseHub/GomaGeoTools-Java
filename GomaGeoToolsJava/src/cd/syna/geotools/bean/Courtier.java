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
public class Courtier {

    private int courtierid;
    private String email;
    private String password;
    private char title;
    private String lastname;
    private String firstname;
    private String website;
    private String city;
    private String country;
    private String compagny;
    private String phone;
    private String biography;
    private String specification;

    public Courtier() {
        // constructeur null

    }

    public Courtier(int courtierid, String email, String password, char title, String lastname, String firstname, String website, String city, String country, String compagny, String phone, String biography, String specification) {
        this.courtierid = courtierid;
        this.email = email;
        this.password = password;
        this.title = title;
        this.lastname = lastname;
        this.firstname = firstname;
        this.website = website;
        this.city = city;
        this.country = country;
        this.compagny = compagny;
        this.phone = phone;
        this.biography = biography;
        this.specification = specification;
    }

    public Courtier(String password, String lastname, String firstname, String specification) {
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.specification = specification;
    }

    /**
     * @return the courtierid
     */
    public int getCourtierid() {
        return courtierid;
    }

    /**
     * @param courtierid the courtierid to set
     */
    public void setCourtierid(int courtierid) {
        this.courtierid = courtierid;
    }

    /**
     * @return the email
     */
    public String getEmailCourtier() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmailCourtier(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPasswordCourtier() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPasswordCourtier(String password) {
        this.password = password;
    }

    /**
     * @return the title
     */
    public char getTitleCourtier() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitleCourtier(char title) {
        this.title = title;
    }

    /**
     * @return the lastname
     */
    public String getLastnameCourtier() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastnameCourtier(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the fisrtname
     */
    public String getFirstnameCourtier() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstnameCourtier(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the website
     */
    public String getWebsitecourtier() {
        return website;
    }

    /**
     * @param website the website to set
     */
    public void setWebsitecourtier(String website) {
        this.website = website;
    }

    /**
     * @return the city
     */
    public String getCitycourtier() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCitycourtier(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountrycourtier() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountrycourtier(String country) {
        this.country = country;
    }

    /**
     * @return the compagny
     */
    public String getCompagnycourtier() {
        return compagny;
    }

    /**
     * @param compagny the compagny to set
     */
    public void setCompagnycourtier(String compagny) {
        this.compagny = compagny;
    }

    /**
     * @return the phone
     */
    public String getPhonecourtier() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhonecourtier(String phone) {
        this.phone = phone;
    }

    /**
     * @return the biography
     */
    public String getBiographycourtier() {
        return biography;
    }

    /**
     * @param biography the biographie to set
     */
    public void setBiographycourtier(String biography) {
        this.biography = biography;
    }

    /**
     * @return the specification
     */
    public String getSpecificationcourtier() {
        return specification;
    }

    /**
     * @param specification the specification to set
     */
    public void setSpecificationcourtier(String specification) {
        this.specification = specification;
    }
}
