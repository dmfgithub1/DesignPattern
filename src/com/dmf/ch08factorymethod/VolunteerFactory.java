package com.dmf.ch08factorymethod;

public class VolunteerFactory implements FactoryMethod{

	@Override
	public LeiFeng getLeifeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
