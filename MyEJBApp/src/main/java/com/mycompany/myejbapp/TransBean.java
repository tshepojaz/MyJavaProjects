/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import com.company.myejbapp.entities.Animal;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author DineoJaz
 */
@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.BEAN)
public class TransBean {

    @Resource
    private UserTransaction utx;
    @PersistenceContext(unitName = "com.mycompany_MyEJBApp_ejb_1.0-SNAPSHOTPU")
    EntityManager em;

    public void saveAnimal() {
        try {
          utx.begin();
            Animal a = new Animal();
            a.setTotalNo(5);
            a.setType("Rhino");
            em.persist(a);
          utx.commit();
        } catch (Exception e) {
        }
    }
}
