package com.dmf.ch21singleton;

/**
 * @author: dmf
 * @date: 2019年4月15日
 * @description: 饿汉单例
 */
public class Singleton {

	private static Singleton singleton = new Singleton();
	
	//或者使用静态代码块的方式，这两种方式类似。
//	private static Singleton singleton;
//	static {
//		singleton = new Singleton();
//	}
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
}
