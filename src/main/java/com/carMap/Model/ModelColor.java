package com.carMap.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "colors")
public class ModelColor 
{
	@Id
	@GeneratedValue
	private int colorId;
	private String colorName;
	
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JsonIgnore
    private Car cars1;

	
	
	

	public int getColorId() {
		return colorId;
	}



	public void setColorId(int colorId) {
		this.colorId = colorId;
	}



	public String getColorName() {
		return colorName;
	}



	public void setColorName(String colorName) {
		this.colorName = colorName;
	}



	public Car getCars1() {
		return cars1;
	}



	public void setCars1(Car cars1) {
		this.cars1 = cars1;
	}


	
	
	//getter setter
	
	
	
	
	

}
