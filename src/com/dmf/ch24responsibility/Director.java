package com.dmf.ch24responsibility;
/**
 * @author: dmf
 * @date: 2019年4月16日
 * @description: 总监类
 */
public class Director extends Manger{

	public Director(String name) {
		super(name);
	}
	@Override
	public void request(Request request) {
		if("请假".equals(request.getRequestType()) && request.getNum()<=5) {//总监可以准许5天以内的假期
			System.out.println(name+":"+request.getRequestContent()+"批准了！");
		}else {
			if(manger!=null) {
				manger.request(request);
			}
		}
			
	}

}
