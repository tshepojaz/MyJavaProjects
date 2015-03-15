/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animalweb;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author DineoJaz
 */
@ManagedBean
@SessionScoped
public class MySessionBean {

   private int number = new Random().nextInt();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
   
}
