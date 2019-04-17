package com.dmf.ch25metiator;

/**
 * @author: dmf
 * @date: 2019年4月17日
 * @description: 具体中介者类-房屋中介者
 */
public class RentingMetiator extends Metiator{

	private HouseOwner houserOwner;
	private Tenant tenant;
	
	
	
	public HouseOwner getHouserOwner() {
		return houserOwner;
	}



	public void setHouserOwner(HouseOwner houserOwner) {
		this.houserOwner = houserOwner;
	}



	public Tenant getTenant() {
		return tenant;
	}



	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}



	@Override
	public void sendMessage(String message, Person person) {
		if(person==houserOwner) {//如果是房东，则是租房者获得信息
			tenant.getMessage(message);
		}else {//反之，则是房东获得信息
			houserOwner.getMessage(message);
		}
	}

}
