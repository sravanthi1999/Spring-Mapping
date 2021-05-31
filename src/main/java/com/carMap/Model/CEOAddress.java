package com.carMap.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="ceoaddress")
public class CEOAddress 
{
	 @Id
	 @Column(name = "addressid")
     private int addressId;
	 @Column(name = "location")
     private String location;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
     
  
}