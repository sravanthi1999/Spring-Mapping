package com.carMap.TestController;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.carMap.Repository.IcompanyRepo;

//@TestMethodOrder(OrderAnnotation.class)
@TestMethodOrder(Alphanumeric.class)
public class TestCarCompany 
{
	
	@Autowired
	IcompanyRepo crepo;
	
	@BeforeEach
	public void setup()
	{
		System.out.println("before each method");
	}
	
	
	
    @Test
//    @Order(2)
    @RepeatedTest(value=2)
    @DisplayName(" enter param's")
	public List<Object[]> testGetCompanies(@PathVariable(value = "id1") int id1, @PathVariable(value = "id2") int id2)
	{
		//log.debug("getting values between range of id's");
		System.out.println("with in the test case");
		return crepo.getCompanys(id1,id2);	
	}
	
	@Test
	
	//@Order(1)
	public void some() {
		System.out.println("with in the test case1");
		
	}
	
	@Test
	//@Order()
	@Disabled
	public void second()
	{
		System.out.println("with in the test case2");
	}
}
