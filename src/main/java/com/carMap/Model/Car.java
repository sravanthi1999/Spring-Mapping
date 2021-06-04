package com.carMap.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="car")
public class Car 
{

	@Id
	@GeneratedValue
	private int carId;
	private String carName;
	

	 
    @ManyToOne(cascade = CascadeType.MERGE)
    private Models carmodel;
	

    @OneToMany(cascade = CascadeType.MERGE)
    private List<ModelColor> carcolor;
	
    
	@ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name="ModelFuels",joinColumns= @JoinColumn(name="modelId") ,inverseJoinColumns= @JoinColumn(name="fuelId"))                   
    private List<CarFuel> carFuels;


	
    
	//remove if error occurs
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private CarCompany carCompany;
	
	

	

	public Models getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(Models carmodel) {
		this.carmodel = carmodel;
	}

	//getter setter
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
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

	public List<ModelColor> getCarcolor() {
		return carcolor;
	}

	public void setCarcolor(List<ModelColor> carcolor) {
		this.carcolor = carcolor;
	}
	
	

	
	
		
}