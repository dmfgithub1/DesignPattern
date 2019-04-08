package com.dmf.ch02strategy;

/**
 * @author dmf
 * @date 2019年3月6日
 * @Descript  打折算法类
 */
public class CashRebate extends CashSuper {

	private double moneyRebate = 1;//折扣率
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}
	@Override
	public double acceptCash(double money) {
		
		return money*moneyRebate;
	}

}
