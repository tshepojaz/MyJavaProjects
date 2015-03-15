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
public interface MySingletonBeanLocal {
    void increment();
    int getNumber();
}
