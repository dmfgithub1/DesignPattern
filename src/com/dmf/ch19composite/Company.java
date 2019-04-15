package com.dmf.ch19composite;
/**
 * 
 * @author: dmf
 * @date: 2019年4月15日
 * @description:
 */
public abstract class Company {

	protected String name;
	public Company(String name) {
		this.name = name;
	}
	
	public abstract void Add(Company c);
	public abstract void Remove(Company c);
	public abstract void Display(int depth);
	public abstract void LineOfDuty();

}
