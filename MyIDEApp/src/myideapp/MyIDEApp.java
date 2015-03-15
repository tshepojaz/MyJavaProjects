/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myideapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MyIDEApp {

    
    public static void main(String[] args) {
      EntityManagerFactory  emf = Persistence.createEntityManagerFactory("MyIDEAppPU");
      EntityManager em = emf.createEntityManager();
      
      //add record
      
      em.getTransaction().begin();
      Staff staff = new Staff();
      staff.setName("ideStaff");
      staff.setAge(25);
      staff.setGender("M");
      staff.setSalary(25000);
      
      em.persist(staff);
      
      em.getTransaction().commit();
      
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
