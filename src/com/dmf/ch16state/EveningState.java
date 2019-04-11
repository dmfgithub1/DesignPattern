package com.dmf.ch16state;

public class EveningState implements State{

	@Override
	public void WriteProgram(Work work) {
		int hour = work.getHour();
		if(work.isWorkFinished()) {
			work.SetState(new RestState());
			work.WriteProgram();
		}else {
			if(hour<21) {
				System.out.println("当前时间："+hour+"点，加班，满身疲惫！");
			}else {
				work.SetState(new SleepingState());
				work.WriteProgram();
			}
		}
	}

}
