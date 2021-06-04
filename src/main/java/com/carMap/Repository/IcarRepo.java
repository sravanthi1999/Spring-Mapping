package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carMap.Model.Car;

public interface IcarRepo extends JpaRepository<Car, Integer>
{

}
