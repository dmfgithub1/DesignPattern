package com.dmf.ch07proxy;

public class Proxy implements GiveGift{

	private Pursuit pursuit;
	public Proxy(Pursuit pursuit) {
		this.pursuit = pursuit;
	}
	@Override
	public void GiveDolls() {
		System.out.println("I am proxy");
		pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		System.out.println("I am proxy");
		pursuit.GiveFlowers();
		
	}

	@Override
	public void GiveChocolate() {
		System.out.println("I am proxy");
		pursuit.GiveChocolate();
		
	}

}
