package com.spring.spring_di;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
		public Employee(@Value("abhay")String name,@Value("20")int experience) {
		super();
		this.name = name;
		Experience = experience;
	}
		
		private String name;
		private int Experience; 
	}


