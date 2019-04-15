package com.dmf.ch21singleton;
/**
 * @author: dmf
 * @date: 2019年4月15日
 * @description: 懒汉式单例，起到了懒加载（Lazy Loading）的作用，但是在多线程下可能会出现线程安全问题
 */
public class Singleton1 {

	private static Singleton1 singleton;
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		if(singleton==null) {
			singleton = new Singleton1();
		}
		return singleton;
	}
	
	//可以实现线程同步,但是缺点是同步效率太低,每次获取实例时都要进行同步
	public synchronized static Singleton1 getInstance1() {
		if(singleton==null) {
			singleton = new Singleton1();
		}
		return singleton;
	}
	
	//和上面的方法本质上相同
	public static Singleton1 getInstance2() {
		synchronized (Singleton1.class) {
			if(singleton==null) {
				singleton = new Singleton1();
			}
		}
		return singleton;
	}
	
	//双重检查,既保证了线程安全问题,又实现了懒加载
	//可能会出现由于指令重排导致的安全问题,可以使用在声明singleton时加上volatile关键字
	public static Singleton1 getInstance3() {
		if(singleton==null) {
			synchronized (Singleton1.class) {
				if(singleton==null) {
					singleton = new Singleton1();
				}
			}
			
		}
		return singleton;
	}
	
}
