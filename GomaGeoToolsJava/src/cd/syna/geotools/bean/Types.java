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
public class Types {
    private int _id;
  private  int typeId;
  private String type;
  
  public  Types(int typesid,String type){
      this.typeId=typesid;
      this.type=type;
  }
  public int gettypeid(){
      return typeId;
  }
  public void settypeid(int typeid){
       this.typeId=typeid;
     
  }
  public String gettype(){
        return type;
  }
  public void settype(String type){
      this.type=type;
  }
}
