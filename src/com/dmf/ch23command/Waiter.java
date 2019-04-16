package com.dmf.ch23command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: dmf
 * @date: 2019年4月16日
 * @description: 命令模式的Invoke
 */
public class Waiter {

	private List<Command> commandList = new ArrayList<Command>();
	
	//增加订单
	public void addOrder(Command command) {
		commandList.add(command);
	}
	//取消订单
	public void removeOrder(Command command) {
		System.out.println("取消订单");
		commandList.remove(command);
	}
	
	public void notice() {
		for (Command command : commandList) {
			command.execute();
		}
	}
}
