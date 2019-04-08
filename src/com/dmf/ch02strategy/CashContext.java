package com.dmf.ch02strategy;


/**
 * @author dmf
 * @date 2019年3月6日
 * @Descript Context对象类，持有 一个CashSuper对象，使用时传递的是CashSuper具体实现类
 */
public class CashContext {

	private CashSuper cashSuper;
	
	public CashContext(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}
	public double getResult(double money) {
		
		return cashSuper.acceptCash(money);
	}
}
