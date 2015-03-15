/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import javax.ejb.Singleton;

/**
 *
 * @author DineoJaz
 */
@Singleton
public class MySingletonBean implements MySingletonBeanLocal {
    int number;
    @Override
    public void increment() {
        number++;
    }

    @Override
    public int getNumber() {
        return number;
    }

}
