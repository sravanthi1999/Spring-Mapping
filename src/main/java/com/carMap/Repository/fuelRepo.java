package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarFuel;

@Repository
public interface fuelRepo extends JpaRepository<CarFuel, Integer> 
{

}
