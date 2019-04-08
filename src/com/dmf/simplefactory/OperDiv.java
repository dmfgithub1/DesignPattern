package com.dmf.simplefactory;

public class OperDiv extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		if(_numB==0) {
			try {
				throw new Exception("除数不能为0！");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			
		result = _numA/_numB;
		return result;
	}

	
}
