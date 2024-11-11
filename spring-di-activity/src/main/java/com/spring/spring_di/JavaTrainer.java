package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("java")
public class JavaTrainer {
	
 private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public JavaTrainer(@Value("Prthvi")String name) {
	super();
	this.name = name;
}
}
