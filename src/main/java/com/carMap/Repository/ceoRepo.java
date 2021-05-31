package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carMap.Model.CompanyCEO;

public interface ceoRepo extends JpaRepository<CompanyCEO, Integer>
{

}
