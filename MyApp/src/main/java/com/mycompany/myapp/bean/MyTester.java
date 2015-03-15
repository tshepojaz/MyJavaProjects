/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.bean;

import com.mycompany.myapp.entities.Vet;
import com.mycompany.myapp.entities.InHouseVet;

import com.mycompany.myapp.entities.Animal;
import com.mycompany.myapp.entities.Cage;
import com.mycompany.myapp.entities.Category;
import com.mycompany.myapp.entities.ExternalVet;
import com.mycompany.myapp.entities.Staff;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author DineoJaz
 */
@Singleton
@Startup
public class MyTester {

    @PersistenceContext(name="com.mycompany_MyApp_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    @PostConstruct
    public void myMain(){
        
//      TypedQuery<Animal> query = em.createQuery("select a from ANIMAL a",Animal.class);
//      List<Animal> list = query.getResultList();
//      
//      for(Animal a: list){
//          System.out.println(a.getType() + "--" + a.getTotalNo());
//      }
      
       //Versioning
        Cage c = em.find(Cage.class,1);
        c.setCageNo("B9");
        
      /*ExternalVet vet = new ExternalVet();
      vet.setName("Jaz");
      vet.setVistingFees(30000);
      vet.setCountry("South Africa");
      vet.setQualification("Btech");
      
      em.persist(vet);*/
        
      /*Animal animal = new Animal();
      animal.setType("Panda");
      animal.setTotalNo(2);
      
      Category category = em.find(Category.class, 1);
      
      //Relationship from both side
      animal.setCategory(category);
      category.getAnimalList().add(animal);
     
      
      //persist
      em.persist(animal);
      */
        
      
    }
}

