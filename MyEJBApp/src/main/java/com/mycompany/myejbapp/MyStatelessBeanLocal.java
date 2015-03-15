/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import com.company.myejbapp.entities.Animal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DineoJaz
 */
@Local
public interface MyStatelessBeanLocal {
    
    String sayHello(String name);
    
    List<Animal> getAllAnimal();
    
    
}
