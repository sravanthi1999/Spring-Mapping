package com.carMap.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

@Table(name="carmodel")
public class CarModel 
{

	@Id
	@Column(name = "modelid")
	@GeneratedValue
	private int modelId;
	
	@Column(name = "modelname")
	private String modelName;
	
	@Column(name = "modeltype")
	private String modelType;
	
	@Column(name = "modelcolor")
	private String modelColor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private CarCompany carCompany;
//	
	
//	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="ModelFuels",joinColumns= @JoinColumn(name="modelId") ,inverseJoinColumns= @JoinColumn(name="fuelId"))                   
    private List<CarFuel> carFuels;

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getModelColor() {
		return modelColor;
	}

	public void setModelColor(String modelColor) {
		this.modelColor = modelColor;
	}

	public CarCompany getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(CarCompany carCompany) {
		this.carCompany = carCompany;
	}

	public List<CarFuel> getCarFuels() {
		return carFuels;
	}

	public void setCarFuels(List<CarFuel> carFuels) {
		this.carFuels = carFuels;
	} 
	

	
}