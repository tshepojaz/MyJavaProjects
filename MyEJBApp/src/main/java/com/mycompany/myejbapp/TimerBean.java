/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myejbapp;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.ScheduleExpression;
import javax.ejb.Timeout;
import javax.ejb.TimerService;

/**
 *
 * @author DineoJaz
 */
@Stateless
@LocalBean
public class TimerBean {
    
    //Programmatic timer
    @Resource
    TimerService ts;
    
    public void startMyTime(){
        ScheduleExpression se = new ScheduleExpression().hour("*").minute("*").second("*");
        ts.createCalendarTimer(se);
    }
    
    @Timeout
    public void myProgTimerMethod(){
        System.out.println("I am a prog timer");
    }
//    @Schedule(minute="*",hour="*",second="*")
//    public void myTimerMethod(){
//        System.out.println("II am invoked");
//    }

}
