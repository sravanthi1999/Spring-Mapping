package com.carMap.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carMap.Model.CarCompany;
import com.carMap.Repository.CImplement;
import com.carMap.Repository.companyRepo;

@RestController
public class CompanyController 
{

	@Autowired
	companyRepo crepo;
	
	@Autowired
	CImplement tempRepo;

	
	@GetMapping("/getcompany")
	public List<CarCompany> getCompany()
	{
		//System.out.println(crepo.findAll());
		return crepo.findAll();
	}
	
	@PostMapping("/putcompany")
	public CarCompany insert(@RequestBody CarCompany carcompany)
	{
		return crepo.save(carcompany);
	}
	
}
