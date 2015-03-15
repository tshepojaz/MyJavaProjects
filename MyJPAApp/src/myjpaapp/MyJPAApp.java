/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myjpaapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpaapp.entities.Staff;


public class MyJPAApp {

   
    public static void main(String[] args) {
      EntityManagerFactory  emf = Persistence.createEntityManagerFactory("MyJPAAppPU");
      EntityManager em = emf.createEntityManager();
      
      //add record
      
      /*em.getTransaction().begin();
      Staff staff = new Staff();
      staff.setName("raj");
      staff.setAge(25);
      staff.setGender("M");
      staff.setSalary(25000);
      
      em.persist(staff);
      
      em.getTransaction().commit();*/
      
      //find record
      
      /*Staff staff = em.find(Staff.class, 1);
      System.out.println("Staff name is: "+staff.getName());*/
      
      //update record
      /*em.getTransaction().begin();
       Staff staff = em.find(Staff.class, 1);
       staff.setName("amit");
      em.getTransaction().commit();*/
      
      
      //Delete record
      
      /*em.getTransaction().begin();
        Staff staff = em.find(Staff.class, 1);
        em.remove(staff);
      em.getTransaction().commit();*/
      
      em.close();
      emf.close();
    }
}
