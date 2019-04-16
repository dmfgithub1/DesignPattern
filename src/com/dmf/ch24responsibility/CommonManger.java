package com.dmf.ch24responsibility;
/**
 * @author: dmf
 * @date: 2019年4月16日
 * @description: 经理类
 */
public class CommonManger extends Manger{

	public CommonManger(String name) {
		super(name);
	}

	@Override
	public void request(Request request) {
		if("请假".equals(request.getRequestType())&&request.getNum()<=2) {//经理可以准许2天以内的假期
			System.out.println(name+":"+request.getRequestContent()+"批准！");
		}else {
			if(manger!=null) {
				manger.request(request);
			}
		}
	}

}
