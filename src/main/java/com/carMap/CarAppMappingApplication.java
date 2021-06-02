package com.carMap;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarAppMappingApplication 
{

	private static Logger logger=Logger.getLogger(CarAppMappingApplication.class);
	public static void main(String[] args) 
	{
		Layout layout=new SimpleLayout();
		Appender appender=new ConsoleAppender(layout);
		
		SpringApplication.run(CarAppMappingApplication.class, args);
		logger.addAppender(appender);
		
	}

}
