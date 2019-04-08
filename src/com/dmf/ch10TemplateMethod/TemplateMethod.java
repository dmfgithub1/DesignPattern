package com.dmf.ch10TemplateMethod;

public class TemplateMethod {

	public static void main(String[] args) {
		System.out.println("The paper A : ");
		TestPaperA studentA = new TestPaperA();
		studentA.TestQuestion1();
		studentA.TestQuestion2();
		studentA.TestQuestion3();
		
		System.out.println("The paper B : ");
		TestPaperB studentB = new TestPaperB();
		studentB.TestQuestion1();
		studentB.TestQuestion2();
		studentB.TestQuestion3();


	}

}
