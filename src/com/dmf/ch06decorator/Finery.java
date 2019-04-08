package com.dmf.ch06decorator;

/**
 * @author dmf
 * @date 2019年3月12日
 * @Descript 服饰类
 */
public class Finery extends Person{

	protected Person compent;
	
	public void decorate(Person compent) {
		this.compent = compent;
	}

	@Override
	public void show() {
		if(compent!=null) {
			compent.show();
		}
		
	}
	
	
}
