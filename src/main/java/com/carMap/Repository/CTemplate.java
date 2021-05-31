package com.carMap.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.carMap.Model.CarCompany;

@Repository
public interface CTemplate<T> 
{

	//CarCompany saveCompany(CarCompany carCompany);
	CarCompany getCompany(int carId);
	//CarCompany updateCompany(CarCompany carCompany);
	List<CarCompany> getCompanies();
	
}
