package com.carMap.Repository;

import java.util.List;

import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarCompany;

@Repository
public interface companyRepo extends JpaRepository<CarCompany, Integer>,companyRepoCustom
{
	
	@Query("select companyId, companyName from CarCompany  where companyId between ?1 and ?2 ")
	public List<Object[]> getCompanys(@Param("carId1") int carId1,@Param("carId2") int carId2);
	
	List<CarCompany> findByCompanyNameOrHeadQuaters(String CompanyName, String headQuaters);
	
	@Query("select companyId,companyName, LENGTH(companyName) as companylen from CarCompany where companyName like ?1%")
	  List<Object[]> findByAsArrayAndSort(String companyName, JpaSort sort);
	
	  
	  @Query(value = "select  carcompany.company_name,companyceo.ceoname from carcompany INNER JOIN  companyceo  on carcompany.ceo_ceoid = companyceo.ceoid",nativeQuery = true)
	  public List<Object[]> findWithCeo();

}
