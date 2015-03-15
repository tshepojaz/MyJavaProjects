/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import com.company.myejbapp.entities.Animal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author DineoJaz
 */
@Stateless
public class MyStatelessBean implements MyStatelessBeanLocal {
    
    @PersistenceContext(unitName="com.mycompany_MyEJBApp_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public String sayHello(String name) {
        return "hello, "+name;
    }

    @Override
    public List<Animal> getAllAnimal() {
        TypedQuery<Animal> query = em.createQuery("select a from Animal a",Animal.class);
        return query.getResultList();
    }

    

}
