package com.carMap.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarCompany;

@Repository
public class CImplement implements CTemplate<CarCompany>
{

	//static final String INSERT_QUERY="INSERT INTO CARCOMPANY(companyId,companyName,CTE,headQuaters) VALUES(?,?,?,?)";
	static final String GET_COMPANY_QUERY="";
//	static final String UPDATE_COMPANY_QUERY="";
//	static final String DISPLAY_COMPANIES_QUERY="";
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public CarCompany getCompany(int carId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<CarCompany> getCompanies() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
