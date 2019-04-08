package com.dmf.ch02strategy;

/**
 * @author dmf
 * @date 2019年3月6日
 * @Descript 返利促销算法（满多少减多少）
 */
public class CashReturn extends CashSuper {

	private double moneyCondition = 0.0;
	private double moneyReturn = 0.0;
	public CashReturn(double moneyCondition,double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	@Override
	public double acceptCash(double money) {
		double result = money;
		if(money>=moneyCondition) {
			result = money-moneyReturn;
		}
		return result;
	}

}
