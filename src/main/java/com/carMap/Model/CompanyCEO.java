package com.carMap.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

@Table(name="companyceo")
public class CompanyCEO 
{
   //CEONAme, CEOCOntact, CEOCompany, CEOAddress

   @Id  
   @GeneratedValue
   @Column(name = "ceoid")
   @JsonProperty("CEOId")
   private int ceoId;
   @Column(name = "ceoname")
   @JsonProperty("CEOName")
   private String ceoName;
   @Column(name = "ceocontact")
   @JsonProperty("CEOContact")
   private long ceoContact;
   
   @JsonIgnore
   @OneToOne(mappedBy = "ceo",cascade = CascadeType.ALL)
   private CarCompany carCompany;
 
   
   
//getter setter

   public CarCompany getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(CarCompany carCompany) {
		this.carCompany = carCompany;
	}
	public int getCeoId() {
		return ceoId;
	}
	public void setCeoId(int ceoId) {
		this.ceoId = ceoId;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public long getCeoContact() {
		return ceoContact;
	}
	public void setCeoContact(long ceoContact) {
		this.ceoContact = ceoContact;
	}

	

}