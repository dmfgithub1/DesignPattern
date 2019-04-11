package com.dmf.ch16state;

public class StateMain {

	public static void main(String[] args) {

		Work work = new Work();
		
		work.setHour(9);
		work.WriteProgram();
		work.setHour(10);
		work.WriteProgram();
		work.setHour(12);
		work.WriteProgram();
		work.setHour(13);
		work.WriteProgram();
		work.setHour(14);
		work.WriteProgram();
		work.setHour(17);
		work.WriteProgram();
		
		work.setWorkFinished(false);
		
		work.setHour(19);
		work.WriteProgram();
		work.setHour(22);
		work.WriteProgram();

	}

}
