package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarCompany;

@Repository
public interface companyRepo extends JpaRepository<CarCompany, Integer>
{

}
