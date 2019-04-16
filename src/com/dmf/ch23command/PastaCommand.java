package com.dmf.ch23command;

public class PastaCommand extends Command{

	public PastaCommand(Chef receiver) {
		super(receiver);
	}

	@Override
	public void execute() {

		receiver.cook("意大利面");
	}

}
