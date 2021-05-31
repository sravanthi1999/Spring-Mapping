package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CarModel;

@Repository
public interface modelRepo extends JpaRepository<CarModel, Integer>
{

}
