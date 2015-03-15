/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.interceptor.Interceptors;

/**
 *
 * @author DineoJaz
 */
@Stateless
@LocalBean
public class SampleInterceptorBean {
   @Interceptors(MyInterceptor.class)
   public void someMethod(){
      System.out.println("I'm invoked"); 
   }

}
