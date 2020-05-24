package com.initech.employees;

public class Janitor extends Employee {

	public Janitor() {
		super(500);
	}

	public void clean() {
		System.out.println("Ugh, cleaning duty again.");
	}

}
