package com.dmf.simplefactory;

public class OperationFactory {
	
	public static Operation getOperation(String operate) {
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new OperAdd();
			break;
		case "-":
			oper = new OperSub();
			break;
		case "*":
			oper = new OperMul();
			break;
		case "/":
			oper = new OperDiv();
			break;
		}
		return oper;
	}

}
