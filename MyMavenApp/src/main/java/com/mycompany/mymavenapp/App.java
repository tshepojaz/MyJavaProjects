package com.mycompany.mymavenapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory  emf = Persistence.createEntityManagerFactory("com.mycompany_MyMavenApp_jar_1.0-SNAPSHOTPU");
      EntityManager em = emf.createEntityManager();
      
      //add record
      
      em.getTransaction().begin();
      Staff staff = new Staff();
      staff.setName("Maven Staff");
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
