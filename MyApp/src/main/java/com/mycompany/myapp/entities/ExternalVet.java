/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.entities;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "external_vet")
@DiscriminatorValue("EXT_VET")
public class ExternalVet extends Vet {
   
    private String country;
    @Column(name="VISTING_FEES")
    private int vistingFees;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getVistingFees() {
        return vistingFees;
    }

    public void setVistingFees(int vistingFees) {
        this.vistingFees = vistingFees;
    }   
}
