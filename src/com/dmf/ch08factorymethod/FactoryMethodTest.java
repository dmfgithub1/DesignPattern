package com.dmf.ch08factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		FactoryMethod factory = new UndergraduateFactory();
		LeiFeng student = factory.getLeifeng();
		
		student.Sweep();
		student.Wash();
		student.BuyRice();

	}

}
