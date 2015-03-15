/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DineoJaz
 */
@Entity
@Table(name = "cage")
@NamedQueries({
    @NamedQuery(name = "Cage.findAll", query = "SELECT c FROM Cage c")})
public class Cage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CAGE_ID")
    private Integer cageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CAGE_NO")
    private String cageNo;
    @Size(max = 30)
    @Column(name = "LOCATION")
    private String location;
    @JoinColumn(name = "ANIMAL_ID", referencedColumnName = "ANIMAL_ID")
    @ManyToOne
    private Animal animal;
    
    @Version
    private int version;

    public Cage() {
    }

    public Cage(Integer cageId) {
        this.cageId = cageId;
    }

    public Cage(Integer cageId, String cageNo) {
        this.cageId = cageId;
        this.cageNo = cageNo;
    }

    public Integer getCageId() {
        return cageId;
    }

    public void setCageId(Integer cageId) {
        this.cageId = cageId;
    }

    public String getCageNo() {
        return cageNo;
    }

    public void setCageNo(String cageNo) {
        this.cageNo = cageNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cageId != null ? cageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cage)) {
            return false;
        }
        Cage other = (Cage) object;
        if ((this.cageId == null && other.cageId != null) || (this.cageId != null && !this.cageId.equals(other.cageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.myapp.entities.Cage[ cageId=" + cageId + " ]";
    }
    
}
