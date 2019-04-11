package com.dmf.ch16state;
/**
 * 
 * @author: dmf
 * @date: 2019年4月11日
 * @description:下班状态
 */
public class RestState implements State{

	@Override
	public void WriteProgram(Work work) {
		System.out.println("当前时间："+work.getHour()+"点，下班了，开心！");
	}

}
