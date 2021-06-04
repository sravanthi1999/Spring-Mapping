package com.carMap.Model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "models")
public class Models 
{
	
	
	@Id
	@GeneratedValue
	private int modelId;
	private String modelType;
	

	
	
	@OneToMany(mappedBy = "carmodel")
	@JsonIgnore
    private List<Car> cars;


//	@PrePersist
//	public void addChild()
//    {
//	 	this.carcolor.forEach(modelColor->{modelColor.setModels(this); });
//	}
	
	
	public int getModelId() {
		return modelId;
	}


	public void setModelId(int modelId) {
		this.modelId = modelId;
	}


	public String getModelType() {
		return modelType;
	}


	public void setModelType(String modelType) {
		this.modelType = modelType;
	}



	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}



	
	
	
	
	//getter setter
	

	
	
}
