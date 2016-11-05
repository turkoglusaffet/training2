package com.spring.training2.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {

	private Model model;
	private int size;
	@Autowired
	@Qualifier("apple")
	private Company apple;

	@Autowired
	public Computer(Model model, @Value("1") int size) {
		this.model = model;
		this.size = size;
		System.out.println("Construct Metod : ");
	}

	@PostConstruct
	public void init() {
		System.out.println("Init Metod : ");
	}

	public Model getModel() {
		return model;
	}

	public Company getApple() {
		return apple;
	}
	public void setApple(Company apple) {
		this.apple = apple;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
