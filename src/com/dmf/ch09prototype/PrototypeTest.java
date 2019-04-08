package com.dmf.ch09prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		Resume a = new Resume("wangyi");
		a.setPersonalInfo("male", "23");
		a.setWorkExperience("2009", "111");
		
		Resume b = a.Clone();
		b.setWorkExperience("2009", "222");
		
		Resume c = a.Clone();
		c.setWorkExperience("2009", "333");
		
		a.Display();
		b.Display();
		c.Display();

	}

}
