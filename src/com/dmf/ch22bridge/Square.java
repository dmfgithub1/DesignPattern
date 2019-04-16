package com.dmf.ch22bridge;

public class Square extends Shape{

	@Override
	public void draw() {
		 System.out.println("画一个"+color.show()+"的正方形");				
	}

}
