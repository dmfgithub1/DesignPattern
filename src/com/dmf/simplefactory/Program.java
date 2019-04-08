package com.dmf.simplefactory;

public class Program {

	public static void main(String[] args) {
	
		double numA = 12;
		double numB = 3;
		Operation oper = OperationFactory.getOperation("/");
		oper.set_numA(numA);
		oper.set_numB(numB);
		System.out.println(oper.getResult());
	}

}
