package com.dmf.ch06decorator;

public class BigTrouse extends Finery{

	@Override
	public void show() {
		System.out.println("垮裤！");
		super.show();
	}

}
