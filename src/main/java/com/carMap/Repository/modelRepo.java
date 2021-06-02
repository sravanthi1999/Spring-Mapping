package com.carMap.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarModel;

@Repository
public interface modelRepo extends JpaRepository<CarModel, Integer>
{
	
	@Query(value = "select carmodel.modelname, carcompany.company_name from carmodel inner join carcompany on carmodel.car_company_company_id = carcompany.company_id",nativeQuery = true)
	public List<Object[]> modelCompany();
	
	
}
