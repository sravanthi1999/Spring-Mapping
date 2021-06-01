package com.carMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarAppMappingApplication 
{

	//generetae loggers in this package
	//private static final Logger LOGGER=LoggerFactory.getLogger(CarAppMappingApplication.class);
	public static void main(String[] args) 
	{
		 
		SpringApplication.run(CarAppMappingApplication.class, args);
		
		//LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);
	}

}
