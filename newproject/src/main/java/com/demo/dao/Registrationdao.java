package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Registration;

public interface Registrationdao extends JpaRepository<Registration ,Integer> {
	

}
