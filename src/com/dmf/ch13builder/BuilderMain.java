package com.dmf.ch13builder;

public class BuilderMain {

	public static void main(String[] args) {
		Director director =new Director();
		
		VillaHouseBuilder villBuilder = new VillaHouseBuilder();
		director.builderHouse(villBuilder);
		
		BungalowHouseBuilder bungalowBuilder = new BungalowHouseBuilder();
		director.builderHouse(bungalowBuilder);

	}

}
