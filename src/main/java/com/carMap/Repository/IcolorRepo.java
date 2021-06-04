package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carMap.Model.ModelColor;

public interface IcolorRepo extends JpaRepository<ModelColor, Integer>
{

}
