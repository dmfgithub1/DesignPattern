package com.dmf.ch19composite;

public class HRDepartment extends Company{

	public HRDepartment(String name) {
		super(name);
	}

	@Override
	public void Add(Company c) {
		
	}

	@Override
	public void Remove(Company c) {
		
	}

	@Override
	public void Display(int depth) {
		System.out.println("-" + name);
	}

	@Override
	public void LineOfDuty() {
		System.out.println(name + " staffs' trainning and managing");
	}
}
