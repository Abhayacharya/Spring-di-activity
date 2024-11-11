package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sql")
public class Sqltrainer {
  private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Sqltrainer(@Value("Bharath")String name) {
	super();
	this.name = name;
}
}
