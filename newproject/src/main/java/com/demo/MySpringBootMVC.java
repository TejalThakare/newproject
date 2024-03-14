package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dao.Registrationdao;
import com.demo.model.Registration;


@SpringBootApplication
public class MySpringBootMVC implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootMVC.class,args);
	}

	
	@Autowired 
	private Registrationdao rdao;
	
	
	@Override
	public void run(String... args) throws Exception {
		Registration r1=new Registration();
		r1.setId(1);
		r1.setName("tejal");
		r1.setLname("thakare");
		r1.setMobnum(123456789);
		rdao.save(r1);
		
		Registration r2=new Registration();
		r2.setId(2);
		r2.setName("anshu");
		r2.setLname("jaiswal");
		r2.setMobnum(987654321);
		rdao.save(r2);
		
	}

}
