package com.dmf.ch21singleton;
/**
 * @author: dmf
 * @date: 2019年4月15日
 * @description: 静态内部类实现单例模式，同饿汉单例类似，都是采用了类装载的机制来保证初始化实例时只有一个线程，不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，
   *   没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，
   *   从而完成Singleton的实例化
   *   类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 */
public class Singleton2 {

	private Singleton2() {}
	
	private static class SingletonInstance{
		private static Singleton2 singleton = new Singleton2();
	}
	
	public static Singleton2 getInstance() {
		return SingletonInstance.singleton;
	}
}
