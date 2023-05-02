package com.tbdhealth.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class AssignmentApplication {

	private static Configuration _config;

	@Autowired
	public AssignmentApplication(Configuration config){
		_config = config;
	}

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
		System.out.println("application started at ports "+ _config.getPortNumber() );
	}
}
