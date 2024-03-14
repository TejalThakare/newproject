package com.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.Registrationdao;
import com.demo.model.Registration;


@Controller
@RequestMapping("/api/Register")
public class RegisterController {
	@Autowired
	private Registrationdao rdao;
	
	
	@GetMapping("/teju")
	public List<Registration> getall(){
		return rdao.findAll();
		
	}
	
	
}
