package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carMap.Model.Models;

public interface ImodelsRepo extends JpaRepository<Models, Integer>
{

}
