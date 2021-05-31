package com.carMap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carMap.Model.CEOAddress;

@Repository
public interface addressRepo extends JpaRepository<CEOAddress, Integer>
{

}
