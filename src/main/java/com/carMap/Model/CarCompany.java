package com.carMap.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="carcompany")
public class CarCompany 
{
	   @Id
	   @GeneratedValue
	   private int companyId;
	   
	   private String companyName;
	   
	   private String headQuaters;

	   	
	   
//	   @OneToMany(targetEntity = CarModel.class,cascade = CascadeType.ALL)
//	   @JoinColumn(name ="modelid",referencedColumnName = "companyId" )
	   
	   @OneToMany(mappedBy = "carCompany",  cascade= CascadeType.MERGE)
	   private List<Car> cars;
	   
	   @OneToOne(cascade = CascadeType.MERGE)
	   private CompanyCEO ceo;

	   

//	   @PrePersist
//		public void addChild()
//	    {
//		 	this.models.forEach(carModel->{	 carModel.setCarCompany(this);  });
//		}
	   
	   
	   
	   //getters setters
	   

	   
	   
	   
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getHeadQuaters() {
		return headQuaters;
	}

	public void setHeadQuaters(String headQuaters) {
		this.headQuaters = headQuaters;
	}


	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public CompanyCEO getCeo() {
		return ceo;
	}

	public void setCeo(CompanyCEO ceo) {
		this.ceo = ceo;
	}
	   

}
