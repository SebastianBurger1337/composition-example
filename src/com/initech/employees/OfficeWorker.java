package com.initech.employees;

public class OfficeWorker extends Employee {

	public OfficeWorker() {
		super(2000);
	}

	public void work() {
		System.out.println("More paperwork. Gah.");
	}

}