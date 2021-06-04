package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarFuel;

@Repository
public interface IfuelRepo extends JpaRepository<CarFuel, Integer> 
{

}
