package com.spring.training2.bean;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Company{

	public String getName() {
		return "apple";
	}

	
}
