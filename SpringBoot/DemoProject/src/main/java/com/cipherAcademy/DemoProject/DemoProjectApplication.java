package com.cipherAcademy.DemoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//It is very imp annotation and it combines all the features such as configuration 
// and auto configuration and scanning
@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);  //Starts the whole spring boot application
		System.out.println("Application Started");
	}

}

/*
This is the main class of project it statis the spring boot application
It contains the main method and starts the spring boot and start the emdedded tomacat and scans the components and controllers
 */
