package com.dmf.ch06decorator;

/**
 * @author dmf
 * @date 2019年3月12日
 * @Descript 人类
 */
public class Person {

	public Person() {
		
	}
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("装扮的"+name);
	}
}
