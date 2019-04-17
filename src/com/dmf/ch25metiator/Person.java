package com.dmf.ch25metiator;

/**
 * @author: dmf
 * @date: 2019年4月17日
 * @description: 抽象同事类
 */
public abstract class Person {

	protected String name;
	protected Metiator metiator;
	public Person(String name,Metiator metiator) {
		this.name = name;
		this.metiator = metiator;
	}
}
