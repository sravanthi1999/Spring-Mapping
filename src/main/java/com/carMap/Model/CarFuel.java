package com.carMap.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "fuel")

public class CarFuel 
{
     @Id
     @GeneratedValue
     @Column(name = "fuelId")
     private int fuelId;
     @Column(name = "fuelType")
     private String fuelType;
     
     
     @ManyToMany(mappedBy="carFuels")
     @JsonIgnore
	  private List<CarModel> carModel;


	public int getFuelId() {
		return fuelId;
	}


	public void setFuelId(int fuelId) {
		this.fuelId = fuelId;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public List<CarModel> getCarModel() {
		return carModel;
	}


	public void setCarModel(List<CarModel> carModel) {
		this.carModel = carModel;
	}
  
    
         
}
