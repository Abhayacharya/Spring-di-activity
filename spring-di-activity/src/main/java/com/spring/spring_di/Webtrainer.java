package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("web")
public class Webtrainer {
 private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Webtrainer(@Value("Siddu")String name) {
	super();
	this.name = name;
}
}
