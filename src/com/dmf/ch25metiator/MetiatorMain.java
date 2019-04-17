package com.dmf.ch25metiator;

public class MetiatorMain {

	public static void main(String[] args) {

		RentingMetiator metiator = new RentingMetiator();
		
		HouseOwner houseOwner = new HouseOwner("张三",metiator);
		Tenant tenant = new Tenant("李四",metiator);
		
		metiator.setHouserOwner(houseOwner);
		metiator.setTenant(tenant);
		
		tenant.sendMessage("我需要租一套一室一厅的房子。");
		houseOwner.sendMessage("我这有你需要的房子！");
	}

}
