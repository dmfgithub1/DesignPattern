package com.dmf.ch16state;

/**
 * 
 * @author: dmf
 * @date: 2019年4月11日
 * @description: 工作类
 */
public class Work {

	private int hour = 0;
	private boolean workFinished = false;
	private State current;  //工作状态
	
	public Work() {
		this.current = new ForenoonState();
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public boolean isWorkFinished() {
		return workFinished;
	}

	public void setWorkFinished(boolean workFinished) {
		this.workFinished = workFinished;
	}
	
	public void SetState(State s) {
		current = s;
	}
	
	public void WriteProgram() {
		current.WriteProgram(this);
	}

}
