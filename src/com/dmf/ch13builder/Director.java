package com.dmf.ch13builder;
/**
 * 
 * @author: dmf
 * @date: 2019年4月10日
 * @description:房屋建造指挥者
 */
public class Director {

	public void builderHouse(HouseBuilder builder) {
		builder.builderFoundation();//先造地基
		builder.builderWall();//再造墙体
		builder.builderRoof();//再造屋顶
		builder.builderWall();//再造窗户
		builder.builderDoor();//再造大门
	}
}
