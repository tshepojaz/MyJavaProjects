/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animalweb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author DineoJaz
 */
@ManagedBean
@RequestScoped
public class AnimalBean {

   private String type;
   private int totalNo;
   private MySessionBean mySessionBean;

    public MySessionBean getMySessionBean() {
        return mySessionBean;
    }

    public void setMySessionBean(MySessionBean mySessionBean) {
        this.mySessionBean = mySessionBean;
    }
   
   

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(int totalNo) {
        this.totalNo = totalNo;
    }
   
   public String saveAnimal(){
       //Code to save the animal in DB
       
       System.out.println("Save the animal");
       
       return "show";
       
   }
}
