package com.carMap.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarCompany;

//@Repository
//public class companyRepoImpl implements companyRepoCustom
//{
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	 static RowMapper<CarCompany> rowMapper=(rs,rownum)->
//	 {
//		 CarCompany company=new CarCompany();
//		 company.setCompanyId(rs.getInt("company_id"));
//		 company.setCompanyName(rs.getString("company_name"));
//		 company.setHeadQuaters(rs.getString("headquaters"));
//		 company.setCTE(rs.getString("cte"));
//		 return company;
//	};
//
//	
//	@Override
//	public List<CarCompany> getIdLessThan(int id) 
//	{
//		String query="select company_id,company_name from carcompany  where company_id < "+id;
//		return jdbcTemplate.query(query,rowMapper);
//		//return null;
//	}
//}
