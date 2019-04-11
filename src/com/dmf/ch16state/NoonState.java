package com.dmf.ch16state;

public class NoonState implements State{

	@Override
	public void WriteProgram(Work work) {
		int hour = work.getHour();
		if(hour<13) {
			System.out.println("当前时间："+hour+"点，饿了，吃饭，困了，午休！");
		}else {
			work.SetState(new AfternoonState());
			work.WriteProgram();
		}
	}

}
