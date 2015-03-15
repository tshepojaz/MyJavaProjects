/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import com.company.myejbapp.entities.Animal;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DineoJaz
 */
@Stateful
public class StatefulBean implements StatefulBeanLocal {
    @PersistenceContext(unitName="com.mycompany_MyEJBApp_ejb_1.0-SNAPSHOTPU")
    EntityManager em;
    
    String animalType;
    int animalTotalNo;
    
    @Override
    public void setAnimalType(String type) {
        animalType = type;
    }

    @Override
    public void setAnimalTotalNo(int total) {
        animalTotalNo = total;
    }

    @Override
    public void finish() {
        Animal a = new Animal();
        a.setType(animalType);
        a.setTotalNo(animalTotalNo);
        
        em.persist(a);
        
    }

    

}
