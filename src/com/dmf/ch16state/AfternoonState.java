package com.dmf.ch16state;

/**
 * 
 * @author: dmf
 * @date: 2019年4月11日
 * @description:下午工作状态
 */
public class AfternoonState implements State{

	@Override
	public void WriteProgram(Work work) {
		int hour = work.getHour();
		if(hour<17) {
			System.out.println("当前时间："+hour+"点，下午状态还不错，继续努力！");
		}else {
			work.SetState(new EveningState());
			work.WriteProgram();
		}
	}

}
