
package cd.syna.geotools.bean;

/**
 *
 * @author Mishka
 */
public class Booking {
        
    private int bookingid;
    private int idcity;
    private String bookingdesc;
    private String datetrip;
    private int duration;
    private String paymentmode;
    private String bookingdate;
    private int userid;
    private int courtierid;
    private int pointofinterestid;
    private int idsite;
    
    public Booking(){
        //null constructor
    }
    
    public Booking(int bookingid,int idcity, String bookingdesc,String datetrip,
            int duration,String paymentmode,String bookingdate){
        this.bookingid=bookingid;
        this.idcity=idcity;
        this.bookingdesc=bookingdesc;
        this.datetrip=datetrip;
        this.duration=duration;
        this.paymentmode=paymentmode;
        this.bookingdate=bookingdate;
    }

    /**
     * @return the bookingid
     */
    public int getBookingid() {
        return bookingid;
    }

    /**
     * @param bookingid the bookingid to set
     */
    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
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
     * @return the bookingdesc
     */
    public String getBookingdesc() {
        return bookingdesc;
    }

    /**
     * @param bookingdesc the bookingdesc to set
     */
    public void setBookingdesc(String bookingdesc) {
        this.bookingdesc = bookingdesc;
    }

    /**
     * @return the datetrip
     */
    public String getDatetrip() {
        return datetrip;
    }

    /**
     * @param datetrip the datetrip to set
     */
    public void setDatetrip(String datetrip) {
        this.datetrip = datetrip;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the paymentmode
     */
    public String getPaymentmode() {
        return paymentmode;
    }

    /**
     * @param paymentmode the paymentmode to set
     */
    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    /**
     * @return the bookingdate
     */
    public String getBookingdate() {
        return bookingdate;
    }

    /**
     * @param bookingdate the bookingdate to set
     */
    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
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
     * @return the idsite
     */
    public int getIdsite() {
        return idsite;
    }

    /**
     * @param idsite the idsite to set
     */
    public void setIdsite(int idsite) {
        this.idsite = idsite;
    }
    
    
    
    
}
