package com.dmf.ch21singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMain {

	public static void main(String[] args) {

		System.out.println(Singleton.getInstance()==Singleton.getInstance());
		System.out.println(Singleton1.getInstance()==Singleton1.getInstance());
		System.out.println(Singleton1.getInstance1()==Singleton1.getInstance1());
		System.out.println(Singleton1.getInstance2()==Singleton1.getInstance2());
		System.out.println(Singleton1.getInstance3()==Singleton1.getInstance3());
		System.out.println(Singleton2.getInstance()==Singleton2.getInstance());
		System.out.println(Singleton3.getInstance()==Singleton3.getInstance());
		
//		ExecutorService threadPool = Executors.newFixedThreadPool(20);
//        for (int i = 0; i< 20; i++) {
//            threadPool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName()+":"+Singleton1.getInstance());
//                }
//            });
//        }
//        threadPool.shutdown();
//        
//        System.out.println(Singleton1.getInstance());
	}

}
