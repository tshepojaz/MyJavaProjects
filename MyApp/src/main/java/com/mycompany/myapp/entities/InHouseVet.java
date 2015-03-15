/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 *
 * @author DineoJaz
 */
@Entity
@Table(name = "in_house_vet")
@DiscriminatorValue("IN_VET")
public class InHouseVet extends Vet {
  
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
