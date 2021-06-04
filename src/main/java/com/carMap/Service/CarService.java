package com.carMap.Service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carMap.Controller.CompanyController;
import com.carMap.Model.CarCompany;

@Service
public class CarService 
{
	
	
	private static Logger log=Logger.getLogger(CompanyController.class);
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//JPA QUERIES
	
//	
//	public List<CarCompany> getLess(int id)
//	{
//		return crepo.getIdLessThan(id);
//	}

	
	// GETTING ALL THE LIST OF COMPANY DETAILS WITH RELATIONS
	
//	public List<CarCompany> getAllCompanies()
//	{
//		log.info("finding all the companies details");
//		return crepo.findAll();
//	}
//	
//	// POSTING ALL THE COMPANY DETAILS WITH RELATIONS
//	
//	public CarCompany postCompany(CarCompany carcompany)
//	{
//		log.debug("saving particular company details");
//		return crepo.save(carcompany);
//	}
//	
//	
//	
//	public List<Car> getAll()
//	{
//		return mrepo.findAll();
//	}
//	
//	
//	public List<CarFuel> getAllF()
//	{
//		return frepo.findAll();
//	}
//	
//	//CUSTOM QUERIES
//	
//	//GETTING COMPANY NAME AND ID BETWEEN RANGE OF ID'S
//	
//	public List<Object[]> getCompanies(int id1,int id2)
//	{
//		log.debug("getting values between range of id's");
//		return crepo.getCompanys(id1,id2);	
//	}
//	
//	
//	public List<CarCompany> getCompanyHeadquaters(String CompanyName, String headQuaters)
//	{
//		log.debug("getting company details based on company name and headquaters");
//		return crepo.findByCompanyNameOrHeadQuaters(CompanyName,headQuaters);
//		
//	}
//	
//	
//	public List<Object[]> sortByName(String companyName)
//	{
//		log.debug("getting company details in sorted fashion");
//		return crepo.findByAsArrayAndSort(companyName,JpaSort.unsafe("LENGTH(companyName)"));
//	}
//	
//
//	public List<Object[]> findceo()
//	{
//		return crepo.findWithCeo();
//	}
//	
////	
////	public List<CarCompany> lessThandId(int id)
////	{
////		return crepo.getIdLessThan(id);
////	}
////	
//
//	public List<Object[]> modelcompany()
//	{
//		return mRepo.modelCompany();
//	}
//	
//	
	
}
