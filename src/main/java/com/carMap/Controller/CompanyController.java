package com.carMap.Controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carMap.Model.Car;
import com.carMap.Model.CarCompany;
import com.carMap.Model.CarFuel;
import com.carMap.Model.CompanyCEO;
import com.carMap.Model.ModelColor;
import com.carMap.Model.Models;
import com.carMap.Repository.IcarRepo;
import com.carMap.Repository.IceoRepo;
import com.carMap.Repository.IcolorRepo;
import com.carMap.Repository.IcompanyRepo;
import com.carMap.Repository.IfuelRepo;
import com.carMap.Repository.ImodelsRepo;
import com.carMap.Service.CarService;

@RestController
public class CompanyController 
{
	
	//Logger function
	
	private static Logger log=Logger.getLogger(CompanyController.class);
	
	@Autowired
	IcompanyRepo companyRepo;
	
	@Autowired
	IcarRepo carRepo;
	
	@Autowired
	IceoRepo ceoRepo;
	
	@Autowired
	CarService serviceRepo;
	
	@Autowired
	IcolorRepo colorRepo;
	
	@Autowired
	IfuelRepo fuelRepo;
	
	@Autowired
	ImodelsRepo modelsRepo;
	

	@PostMapping("/postCar")
	public List<Car> enterCar(@RequestBody List<Car> car)
	{
		return carRepo.saveAll(car);
	}
	
	@GetMapping("/getCar")
	public List<Car> getCar()
	{
		return carRepo.findAll();
	}
	
	
	@PostMapping("/postCompany")
	public List<CarCompany> enterCompany(@RequestBody List<CarCompany> company)
	{
		return companyRepo.saveAll(company);
	}
	
	@GetMapping("/getCompany")
	public List<CarCompany> getCompany()
	{
		return companyRepo.findAll();
	}
	
	
	
	@PostMapping("/postCeo")
	public List<CompanyCEO> enterCeo(@RequestBody List<CompanyCEO> ceo)
	{
		return ceoRepo.saveAll(ceo);
	}
	
	@GetMapping("/getCeo")
	public List<CompanyCEO> getCeo()
	{
		return ceoRepo.findAll();
	}
	
	@PostMapping("/postModels")
	public List<Models> enterModels(@RequestBody List<Models> model)
	{
		return modelsRepo.saveAll(model);
		
	}
	
	@GetMapping("/getModels")
	public List<Models> getModels()
	{
		return modelsRepo.findAll();
		
	}
	
  
	@PostMapping("/postFuels")
	public List<CarFuel> enterFules(@RequestBody List<CarFuel> fuel)
	{
		return fuelRepo.saveAll(fuel);
	}
	
	@GetMapping("/getFuels")
	public List<CarFuel> getFules()
	{
		return fuelRepo.findAll();
	}
	
	@PostMapping("/postColors")
	public List<ModelColor> enterColors(@RequestBody List<ModelColor> color)
	{
		return colorRepo.saveAll(color);
	}
	
	@GetMapping("/getColors")
	public List<ModelColor> getColors()
	{
		return colorRepo.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//JPA QUERIES
	
//	
//	// GETTING ALL THE LIST OF COMPANY DETAILS WITH RELATIONS
//	@GetMapping("/getcompany")
//	public List<CarCompany> getAllCompanies()
//	{
//		log.info("finding all the companies details");
//		return serviceRepo.getAllCompanies();
//	}
//	
//	// POSTING ALL THE COMPANY DETAILS WITH RELATIONS
//	@PostMapping("/putcompany")
//	public CarCompany postCompany(@RequestBody CarCompany carcompany)
//	{
//		log.debug("saving particular company details");
//		return serviceRepo.postCompany(carcompany);
//	}
//	
//	
//	@GetMapping("/model-fules")
//	public List<Car> getAll()
//	{
//		return serviceRepo.getAll();
//	}
//	
//	@GetMapping("/fules-models")
//	public List<CarFuel> getAllF()
//	{
//		return serviceRepo.getAllF();
//	}
//	
//	//CUSTOM QUERIES
//	
//	//GETTING COMPANY NAME AND ID BETWEEN RANGE OF ID'S
//	@GetMapping("/getcompanies/{id1},{id2}")
//	public List<Object[]> getCompanies(@PathVariable(value = "id1") int id1, @PathVariable(value = "id2") int id2)
//	{
//		log.debug("getting values between range of id's");
//		return serviceRepo.getCompanies(id1,id2);	
//	}
//	
//	//
//	
//	@GetMapping("/findCompany/{CompanyName}/{headQuaters}")
//	public List<CarCompany> getCompanyHeadquaters(@PathVariable(value = "CompanyName") String CompanyName, @PathVariable(value = "headQuaters") String headQuaters)
//	{
//		log.debug("getting company details based on company name and headquaters");
//		return serviceRepo.getCompanyHeadquaters(CompanyName,headQuaters);
//		
//	}
//	
//	@GetMapping("/sortCompany/{companyName}")
//	public List<Object[]> sortByName(@PathVariable(value = "companyName")String companyName)
//	{
//		log.debug("getting company details in sorted fashion");
//		return serviceRepo.sortByName(companyName);
//	}
//	
//	@GetMapping("/joincompanyceo")
//	public List<Object[]> findceo()
//	{
//		return serviceRepo.findceo();
//	}
//	
////	@GetMapping("/getIds/{id}")
////	public List<CarCompany> lessThandId(@PathVariable int id)
////	{
////		return serviceRepo.lessThandId(id);
////	}
//	
//
//	@GetMapping("/joinmodelcompany")
//	public List<Object[]> modelcompany()
//	{
//		return serviceRepo.modelcompany();
//	}
//	
//	//JDBC template queries
////	@GetMapping("/companyLessThan/{id}")
////	public List<CarCompany> getLess(@PathVariable int id)
////	{
////		return serviceRepo.getLess(id);
////	}
//
//	
}
