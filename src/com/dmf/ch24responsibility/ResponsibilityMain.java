package com.dmf.ch24responsibility;

public class ResponsibilityMain {

	public static void main(String[] args) {

		CommonManger manger = new CommonManger("张三");
		Director diretor = new Director("李四");
		GeneralManger gManger = new GeneralManger("王五");
		
		manger.setManger(diretor);
		diretor.setManger(gManger);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setNum(3);
		request.setRequestContent("赵六请假");
		manger.request(request);
		
		Request request1 = new Request();
		request1.setRequestType("加薪");
		request1.setNum(500);
		request1.setRequestContent("赵六申请加薪");
		manger.request(request1);
	}

}
