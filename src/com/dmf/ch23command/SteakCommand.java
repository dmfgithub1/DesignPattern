package com.dmf.ch23command;

public class SteakCommand extends Command{

	public SteakCommand(Chef receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.cook("牛排");
	}

}
