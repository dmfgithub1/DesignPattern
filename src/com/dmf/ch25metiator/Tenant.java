package com.dmf.ch25metiator;

/**
 * @author: dmf
 * @date: 2019年4月17日
 * @description: 具体同事类-租房者类
 */
public class Tenant extends Person{

	public Tenant(String name, Metiator metiator) {
		super(name, metiator);
	}
	
	/**
	 * @param message
	 * @description:获取信息
	 */
	public void getMessage(String message) {
		 System.out.println("租房者:" + name +",获得房屋信息：" + message);
	}
	
	/**
	 * @param message
	 * @description:与中介者联系
	 */
	public void sendMessage(String message) {
		this.metiator.sendMessage(message, this);
	}

}
