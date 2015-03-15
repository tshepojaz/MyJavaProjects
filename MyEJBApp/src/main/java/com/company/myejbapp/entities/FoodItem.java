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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DineoJaz
 */
@Entity
@Table(name = "food_item")
@NamedQueries({
    @NamedQuery(name = "FoodItem.findAll", query = "SELECT f FROM FoodItem f")})
public class FoodItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FOOD_ITEM_ID")
    private Integer foodItemId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NAME")
    private String name;
    @Size(max = 40)
    @Column(name = "QUANTITY")
    private String quantity;
    @ManyToMany(mappedBy = "foodItemList")
    private List<Animal> animalList;
    @JoinColumn(name = "SUPPLIER_ID", referencedColumnName = "SUPPLIER_ID")
    @ManyToOne
    private Supplier supplierId;

    public FoodItem() {
    }

    public FoodItem(Integer foodItemId) {
        this.foodItemId = foodItemId;
    }

    public FoodItem(Integer foodItemId, String name) {
        this.foodItemId = foodItemId;
        this.name = name;
    }

    public Integer getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(Integer foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public Supplier getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Supplier supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodItemId != null ? foodItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FoodItem)) {
            return false;
        }
        FoodItem other = (FoodItem) object;
        if ((this.foodItemId == null && other.foodItemId != null) || (this.foodItemId != null && !this.foodItemId.equals(other.foodItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.company.myejbapp.entities.FoodItem[ foodItemId=" + foodItemId + " ]";
    }
    
}
