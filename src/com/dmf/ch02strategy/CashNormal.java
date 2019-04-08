package com.dmf.ch02strategy;

/**
 * @author dmf
 * @date 2019年3月6日
 * @Descript  正常收费算法
 */
public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		
		return money;
	}

}
