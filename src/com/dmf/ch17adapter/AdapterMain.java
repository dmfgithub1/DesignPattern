package com.dmf.ch17adapter;

public class AdapterMain {

	public static void main(String[] args) {
	
		Target target = new Adapter();
		target.request();

	}
}
