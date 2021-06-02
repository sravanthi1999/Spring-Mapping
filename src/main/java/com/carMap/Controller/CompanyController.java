package com.carMap.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carMap.Model.CarCompany;
import com.carMap.Model.CarFuel;
import com.carMap.Model.CarModel;
import com.carMap.Repository.companyRepo;
import com.carMap.Repository.fuelRepo;
import com.carMap.Repository.modelRepo;

@RestController
public class CompanyController 
{
	
	//Logger function

	public final Logger log=LoggerFactory.getLogger(CompanyController.class);
	
	@Autowired
	companyRepo crepo;
	
	@Autowired
	modelRepo mrepo;
	
	@Autowired
	fuelRepo frepo;
	
	//JPA QUERIES
	
	// GETTING ALL THE LIST OF COMPANY DETAILS WITH RELATIONS
	@GetMapping("/getcompany")
	public List<CarCompany> getAllCompanies()
	{
		log.info("finding all the companies details");
		return crepo.findAll();
	}
	
	// POSTING ALL THE COMPANY DETAILS WITH RELATIONS
	@PostMapping("/putcompany")
	public CarCompany postCompany(@RequestBody CarCompany carcompany)
	{
		log.trace("saving particular company details");
		return crepo.save(carcompany);
	}
	
	//
	@GetMapping("/model-fules")
	public List<CarModel> getAll()
	{
		return mrepo.findAll();
	}
	
	@GetMapping("/fules-models")
	public List<CarFuel> getAllF()
	{
		return frepo.findAll();
	}
	
	//CUSTOM QUERIES
	
	//GETTING COMPANY NAME AND ID BETWEEN RANGE OF ID'S
	@GetMapping("/getcompanies/{id1},{id2}")
	public List<Object[]> getCompanies(@PathVariable(value = "id1") int id1, @PathVariable(value = "id2") int id2)
	{
		return crepo.getCompanys(id1,id2);	
	}
	
	//
	
	@GetMapping("/findCompany/{CompanyName}/{headQuaters}")
	public List<CarCompany> getCompanyHeadquaters(@PathVariable(value = "CompanyName") String CompanyName, @PathVariable(value = "headQuaters") String headQuaters)
	{
		return crepo.findByCompanyNameOrHeadQuaters(CompanyName,headQuaters);
		
	}
	
	@GetMapping("/sortCompany/{companyName}")
	public List<Object[]> sortByName(@PathVariable(value = "companyName")String companyName)
	{
		return crepo.findByAsArrayAndSort(companyName,JpaSort.unsafe("LENGTH(companyName)"));
	}
	
	@GetMapping("/joincompanyceo")
	public List<Object[]> findceo()
	{
		return crepo.findWithCeo();
	}
	
	@GetMapping("/getIds/{id}")
	public List<CarCompany> lessThandId(@PathVariable int id)
	{
		return crepo.getIdLessThan(id);
	}
	
//	@Autowired
//	modelRepo mRepo;
//	
//	@GetMapping("/joinmodelcompany")
//	public List<Object[]> modelcompany()
//	{
//		return mRepo.modelCompany();
//	}
//	
//	@Autowired
//	jdbctemp tmp;
//	
//	
//	@GetMapping("/joinmodelcompany")
//	public List<Object[]> modelcompany()
//	{
//		return tmp.modelCompany();
//	}
	
}
