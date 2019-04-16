package com.dmf.ch24responsibility;

public abstract class Manger {

	protected String name;
	protected Manger manger;
	
	public Manger(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manger getManger() {
		return manger;
	}
	public void setManger(Manger manger) {
		this.manger = manger;
	}
	
	public abstract void request(Request request);
}
