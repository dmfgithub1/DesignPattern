package com.dmf.simplefactory;

public class OperAdd extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = _numA + _numB;
		return result;
	}

}
