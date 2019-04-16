package com.dmf.ch23command;

/**
 * @author: dmf
 * @date: 2019年4月16日
 * @description: 命令模式的命令抽象
 */
public abstract class Command {

	protected Chef receiver;
	public Command(Chef receiver) {
		this.receiver = receiver;
	}
	
	public Chef getReceiver() {
		return receiver;
	}

	public void setReceiver(Chef receiver) {
		this.receiver = receiver;
	}

	public abstract void execute();
}
