package com.dmf.ch25metiator;

/**
 * @author: dmf
 * @date: 2019年4月17日
 * @description: 具体同事类-房东类
 */
public class HouseOwner extends Person{

	public HouseOwner(String name, Metiator metiator) {
		super(name, metiator);
	}

	/**
	 * @param message
	 * @description:获取信息
	 */
	public void getMessage(String message) {
		 System.out.println("房东:" + name +",获得租房信息：" + message);
	}
	
	/**
	 * @param message
	 * @description:与中介者联系
	 */
	public void sendMessage(String message) {
		this.metiator.sendMessage(message, this);
	}
}
