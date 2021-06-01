package com.carMap.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface  jdbctemp  
{

	 //JdbcTemplate jdbctemp;
	
	@Query(value = "select carmodel.modelname, carcompany.company_name from carmodel inner join carcompany on carmodel.car_company_company_id = carcompany.company_id",nativeQuery = true)
	public abstract   List<Object[]> modelCompany();
//	
//	public CompanyCEO mapRow(ResultSet resultSet, int i) throws SQLException 
//	{
//        return new CompanyCEO();
//	}

}
