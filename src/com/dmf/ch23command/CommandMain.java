package com.dmf.ch23command;

public class CommandMain {

	public static void main(String[] args) {

		Chef cher = new Chef();
		Waiter waiter = new Waiter();
		
		waiter.addOrder(new SteakCommand(cher));
		waiter.addOrder(new PastaCommand(cher));
		
		Command command = new SteakCommand(cher);
		waiter.addOrder(command);
		waiter.removeOrder(command);
		waiter.notice();
		
	}

}
