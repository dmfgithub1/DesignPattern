package com.dmf.ch13builder;

/**
 * 
 * @author: dmf
 * @date: 2019年4月10日
 * @description:别墅建造者
 */
public class VillaHouseBuilder implements HouseBuilder{

	@Override
	public void builderFoundation() {
		System.out.println("建造别墅地基！");
	}

	@Override
	public void builderWall() {
		System.out.println("建造别墅墙体！");
		
	}

	@Override
	public void builderRoof() {
		System.out.println("建造别墅房顶！");
		
	}

	@Override
	public void builderWindow() {
		System.out.println("建造别墅窗户！");
		
	}

	@Override
	public void builderDoor() {
		System.out.println("建造别墅大门！");
		
	}

}
