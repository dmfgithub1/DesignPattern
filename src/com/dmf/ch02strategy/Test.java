package com.dmf.ch02strategy;

public class Test {

	public static void main(String[] args) {
		double money = 450;//消费的总金额
		//正常付费
		CashContext context = new CashContext(new CashNormal());
		System.out.println("正常付费应付金额是："+context.getResult(money));
		
		//7折促销
		CashContext context1 = new CashContext(new CashRebate(0.7));
		System.out.println("7折促销应付金额是："+context1.getResult(money));
		
		//满300减50
		CashContext context2 = new CashContext(new CashReturn(300,50));
		System.out.println("满300减50促销应付金额是："+context2.getResult(money));

	}

}
