/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.myejbapp.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author DineoJaz
 */
@Entity
@Table(name = "emergency")
@NamedQueries({
    @NamedQuery(name = "Emergency.findAll", query = "SELECT e FROM Emergency e")})
public class Emergency implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EMERGENCY_ID")
    private Integer emergencyId;
    @Size(max = 45)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 145)
    @Column(name = "CASE")
    private String case1;
    @Size(max = 145)
    @Column(name = "PROGRESS_SO_FAR")
    private String progressSoFar;

    public Emergency() {
    }

    public Emergency(Integer emergencyId) {
        this.emergencyId = emergencyId;
    }

    public Integer getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(Integer emergencyId) {
        this.emergencyId = emergencyId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCase1() {
        return case1;
    }

    public void setCase1(String case1) {
        this.case1 = case1;
    }

    public String getProgressSoFar() {
        return progressSoFar;
    }

    public void setProgressSoFar(String progressSoFar) {
        this.progressSoFar = progressSoFar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emergencyId != null ? emergencyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emergency)) {
            return false;
        }
        Emergency other = (Emergency) object;
        if ((this.emergencyId == null && other.emergencyId != null) || (this.emergencyId != null && !this.emergencyId.equals(other.emergencyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.myejbapp.entities.Emergency[ emergencyId=" + emergencyId + " ]";
    }
    
}
