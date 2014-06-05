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
public class Comments {
//    private int commentId;
    private int userid;
    private int pointofinterestid;
    private int idsite;
    private String text;
    private String date;
    
    public Comments(){
    
    }
      public Comments(int CommentId,int userid,int pointofinterestid, int idsite,String text, String date){
//          this.commentId=CommentId;
          this.userid=userid;
          this.pointofinterestid=pointofinterestid;
          this.idsite=idsite;
          this.text=text;
          this.date=date;
    
    }
      public Comments(int userid){
          this.userid=userid;
      }
      public int getuserid(){
        return userid;
      
      }
      public void setuserid(int userid){
         this. userid=userid;
      }
      public int getpointofinterestid(){
        return pointofinterestid;
      }
       public void setpointofinterestid(int setpointofinterestid){
        this. pointofinterestid= setpointofinterestid;
      }
      public int getidsite(){
          return idsite;
      }  
      public void setidsite(int idsite){
          this.idsite=idsite;
      }
    public String gettext(){
        return text;
    }
    public void settext(String text){
        this.text=text;
    }
}
