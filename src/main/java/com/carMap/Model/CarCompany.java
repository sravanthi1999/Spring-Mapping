package com.carMap.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="carcompany")

public class CarCompany 
{
	   @Id
	   @Column(name = "companyId")
	   @GeneratedValue
	   private int companyId;
	   
	   @Column(name = "companyName")
	   private String companyName;
	   
	   @Column(name = "headquaters")
	   private String headQuaters;
	   
	   @Column(name = "cte")
	   private String CTE;
	   
//	   @OneToMany(targetEntity = CarModel.class,cascade = CascadeType.ALL)
//	   @JoinColumn(name ="modelid",referencedColumnName = "companyId" )
	   
	   @OneToMany(mappedBy = "carCompany",  cascade= CascadeType.ALL)
	   private List<CarModel> models;
//	   
	   @OneToOne(cascade = CascadeType.ALL)
	   private CompanyCEO ceo;
//	   
	   @PrePersist
		public void addChild()
	    {
		 	this.models.forEach(carModel->{	 carModel.setCarCompany(this);  });
		}
	   
	   
	   
	   //getters setters
	   
	   
	   @Override
		public String toString() 
	   {
			return "CarCompany [companyId=" + companyId + 
					", companyName=" + companyName + 
					", headQuaters=" + headQuaters+ 
					", CTE=" + CTE + 
					", models=" + models + 
					", ceo=" + ceo + "]";
		}



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



	public String getCTE() {
		return CTE;
	}



	public void setCTE(String cTE) {
		CTE = cTE;
	}



	public List<CarModel> getModels() {
		return models;
	}



	public void setModels(List<CarModel> models) {
		this.models = models;
	}



	public CompanyCEO getCeo() {
		return ceo;
	}



	public void setCeo(CompanyCEO ceo) {
		this.ceo = ceo;
	}
	   
  
	
	
	   
}
