package com.dmf.ch17adapter;
/**
 * 
 * @author dmf
 * @date 2019年4月11日
 * @Descript 适配器类
 */
public class Adapter extends Target{

	private Adaptee adaptee = new Adaptee();
	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
