package com.dmf.ch06decorator;

public class Test {

	public static void main(String[] args) {
		Person per = new Person("张三");
		
		TShirts ts = new TShirts();
		BigTrouse bt = new BigTrouse();
		
		bt.decorate(per);
		ts.decorate(bt);
		ts.show();

	}

}
