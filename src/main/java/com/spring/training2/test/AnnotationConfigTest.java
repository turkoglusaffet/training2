package com.spring.training2.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training2.bean.Computer;

public class AnnotationConfigTest {
	
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:application-context.xml")) {
		
			Computer computer = (Computer) context.getBean("computer");
			System.out.println(computer.getSize());
			System.out.println(computer.getModel().getName());
			System.out.println(computer.getApple().getName());
		}
	}
	
}
