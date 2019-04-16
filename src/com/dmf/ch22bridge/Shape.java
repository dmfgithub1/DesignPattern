package com.dmf.ch22bridge;

public abstract class Shape {

	protected  Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
}
