package com.dmf.ch13builder;

/**
 * 
 * @author: dmf
 * @date: 2019年4月10日
 * @description:平房建造者
 */
public class BungalowHouseBuilder implements HouseBuilder{

	@Override
	public void builderFoundation() {
		System.out.println("建造平房地基！");
		
	}

	@Override
	public void builderWall() {
		System.out.println("建造平房墙体！");
		
	}

	@Override
	public void builderRoof() {
		System.out.println("建造平房房顶！");
		
	}

	@Override
	public void builderWindow() {
		System.out.println("建造平房窗户！");
		
	}

	@Override
	public void builderDoor() {
		System.out.println("建造平房大门！");
		
	}

}
