package com.dmf.ch16state;

public class SleepingState implements State{

	@Override
	public void WriteProgram(Work work) {
		System.out.println("当前时间："+work.getHour()+"点，好困，睡觉！");
	}

}
