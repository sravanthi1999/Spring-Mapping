package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carMap.Model.CompanyCEO;

public interface IceoRepo extends JpaRepository<CompanyCEO, Integer>
{

}
