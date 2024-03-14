package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register")
public class Registration {
	@Id
	private int id;
	private String name;
	private String lname;
	private int mobnum;
	
//	------------------------default constructor----------------------------------
	public Registration() {
		super();
	}

//	--------------------------parametrized constructor--------------------------------

	public Registration(int id,String name, String lname, int mobnum) {
		super();
		this.id=id;
		this.name = name;
		this.lname = lname;
		this.mobnum = mobnum;
	}
	
//	-------------------setter gettters-------------------------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getMobnum() {
		return mobnum;
	}

	public void setMobnum(int mobnum) {
		this.mobnum = mobnum;
	}



	
//----------------------------to string method---------------------------------
	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", lname=" + lname + ", mobnum=" + mobnum + "]";
	}


	
	
	
	

}
