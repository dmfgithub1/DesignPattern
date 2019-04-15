package com.dmf.ch21singleton;

public class Singleton3 {

	private Singleton3() {}
	
	public static Singleton3 getInstance() {
        return EnmuSingleton.Singleton.getInstance();
    }
	// 内部枚举类
    private enum EnmuSingleton{
        Singleton;
        private Singleton3 singleton;
        
        //枚举类的构造方法在类加载是被实例化 
        private EnmuSingleton(){
            singleton = new Singleton3();
        }
        public Singleton3 getInstance(){
            return singleton;
        }
    }
}
