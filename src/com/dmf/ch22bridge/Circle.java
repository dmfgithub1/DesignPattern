package com.dmf.ch22bridge;

public class Circle extends Shape{

	@Override
	public void draw() {
         System.out.println("画一个"+color.show()+"圆形");		
	}

}
