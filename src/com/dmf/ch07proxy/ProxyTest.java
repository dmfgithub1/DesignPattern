package com.dmf.ch07proxy;

public class ProxyTest {

	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl("貂蝉");
		Pursuit pursuit = new Pursuit(girl);
		Proxy proxy = new Proxy(pursuit);
		
		proxy.GiveDolls();
		proxy.GiveFlowers();
		proxy.GiveChocolate();

	}

}
