/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import javax.ejb.Local;

/**
 *
 * @author DineoJaz
 */
@Local
public interface StatefulBeanLocal {
    void setAnimalType(String type);
    void setAnimalTotalNo(int total);
    void finish();
}
