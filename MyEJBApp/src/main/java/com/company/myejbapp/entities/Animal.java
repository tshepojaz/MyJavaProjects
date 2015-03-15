/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.myejbapp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DineoJaz
 */
@Entity
@Table(name = "animal")
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a")})
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ANIMAL_ID")
    private Integer animalId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TYPE")
    private String type;
    @Column(name = "TOTAL_NO")
    private Integer totalNo;
    @JoinTable(name = "animal_food_item", joinColumns = {
        @JoinColumn(name = "ANIMAL_ID", referencedColumnName = "ANIMAL_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "FOOD_ITEM_ID", referencedColumnName = "FOOD_ITEM_ID")})
    @ManyToMany
    private List<FoodItem> foodItemList;
    @OneToMany(mappedBy = "animalId")
    private List<Cage> cageList;
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
    @ManyToOne
    private Category category;

    public Animal() {
    }

    public Animal(Integer animalId) {
        this.animalId = animalId;
    }

    public Animal(Integer animalId, String type) {
        this.animalId = animalId;
        this.type = type;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(Integer totalNo) {
        this.totalNo = totalNo;
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public List<Cage> getCageList() {
        return cageList;
    }

    public void setCageList(List<Cage> cageList) {
        this.cageList = cageList;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategoryId(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (animalId != null ? animalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.animalId == null && other.animalId != null) || (this.animalId != null && !this.animalId.equals(other.animalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.myejbapp.entities.Animal[ animalId=" + animalId + " ]";
    }
    
}
