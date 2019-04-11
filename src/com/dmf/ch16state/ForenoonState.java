package com.dmf.ch16state;

/**
 * 
 * @author: dmf
 * @date: 2019年4月11日
 * @description:上午工作类
 */
public class ForenoonState implements State{

	@Override
	public void WriteProgram(Work work) {
		int hour = work.getHour();
		if(hour<12) {
			System.out.println("当前时间："+hour+"点，上午工作，精神百倍！");
		}else {
			work.SetState(new NoonState());
			work.WriteProgram();
		}
	}

}
