package com.carMap.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarCompany;

@Repository
public interface CTemplate 
{

	
	@Query(value="select c.companyId, c.companyName from CarCompany c where c.carId between :carId1 and :carId2 ",nativeQuery = true)
	CarCompany getCompanys(@Param("carId1") int carId1,@Param("carId2") int carId2);
	
	//List<CarCompany> getCompanies();
	
}
