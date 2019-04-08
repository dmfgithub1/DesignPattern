package com.dmf.ch07proxy;

public class Pursuit implements GiveGift{

	private SchoolGirl girl;
	public Pursuit(SchoolGirl girl) {
		this.girl = girl;
	}
	@Override
	public void GiveDolls() {
		System.out.println("Give you dolls,"+girl.getName());
		
	}

	@Override
	public void GiveFlowers() {
		System.out.println("Give you Flowers,"+girl.getName());
		
	}

	@Override
	public void GiveChocolate() {
		System.out.println("Give you Chocolate,"+girl.getName());
		
	}

}
