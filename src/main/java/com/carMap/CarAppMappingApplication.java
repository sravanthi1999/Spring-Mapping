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
		//create layout
//		
		Layout layout=new SimpleLayout();
//		Layout layout2=new HTMLLayout();
//		Layout layout3=new XMLLayout();
//		
		
		//create appender+ link layout
//		
		Appender appender=new ConsoleAppender(layout);
//		Appender appender2=new ConsoleAppender(layout2);
//		 Appender appender3=new ConsoleAppender(layout3);
		
		
		SpringApplication.run(CarAppMappingApplication.class, args);
		
		//link appender with logger
		
		logger.addAppender(appender);
//		logger.addAppender(appender2);
//		logger.addAppender(appender3);
//		
//		
//		logger.info("main class info");
//		logger.debug("main class debug");
//		logger.fatal("main class fatal");
//		logger.error("main class error");
//		logger.warn("main class info");
		
	}

}
