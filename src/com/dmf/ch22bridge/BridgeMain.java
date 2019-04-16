package com.dmf.ch22bridge;

public class BridgeMain {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.setColor(new White());
		circle.draw();
		
		Shape square = new Square();
		square.setColor(new Blue());
		square.draw();
	}
}
