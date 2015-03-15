/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import com.company.myejbapp.entities.Animal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author DineoJaz
 */

@Singleton
@Startup
public class MyTester {
    @EJB
    SampleInterceptorBean myBean;
    
    @PostConstruct
    public void MyMain(){
        //Stateless bean
       //System.out.println(myBean.sayHello("Tshepo and Neo")); 
//       List<Animal> list = myBean.getAllAnimal();
//       
//       for(Animal animal: list){
//           System.out.println(animal.getType());
//       }
        
       //Statefull bean 
//       myBean.setAnimalType("Cheetah");
//       myBean.setAnimalTotalNo(3);
//       
//       myBean.finish();
        
        //Singleton bean
//        myBean.increment();
//        myBean.increment();
//        System.out.println(myBean.getNumber());
        
        //TransactionManagement
        
//        myBean.saveAnimal();
        
        //Execute programmatic timer
//        myBean.startMyTime(); 
        
        //Interceptors
//        myBean.someMethod();
    }
}
