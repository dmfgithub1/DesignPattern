package com.dmf.ch08factorymethod;

public class UndergraduateFactory implements FactoryMethod{

	@Override
	public LeiFeng getLeifeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}

}
