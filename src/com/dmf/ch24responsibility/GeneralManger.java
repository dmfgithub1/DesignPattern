package com.dmf.ch24responsibility;

/**
 * @author: dmf
 * @date: 2019年4月16日
 * @description: 总经理类
 */
public class GeneralManger extends Manger{

	public GeneralManger(String name) {
		super(name);
	}

	@Override
	public void request(Request request) {

		if("请假".equals(request.getRequestType()) && request.getNum()<=10) {//准许10天内的假期
			System.out.println(name+":"+request.getRequestContent()+"批准了");
		}else if("请假".equals(request.getRequestType()) && request.getNum()>10) {
			System.out.println(name+":"+request.getRequestContent()+"不同意");
		}else if("加薪".equals(request.getRequestType()) && request.getNum()<=1000) {//准许1000以内的加薪
			System.out.println(name+":"+request.getRequestContent()+"批准了");
		}else if("加薪".equals(request.getRequestType()) && request.getNum()>1000) {
			System.out.println(name+":"+request.getRequestContent()+"不同意");
		}
	}

}
