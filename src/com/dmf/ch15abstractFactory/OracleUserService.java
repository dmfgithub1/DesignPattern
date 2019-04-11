package com.dmf.ch15abstractFactory;

public class OracleUserService implements UserService{

	@Override
	public void insert() {
		System.out.println("往oracle的user表中插入一条数据！");
		
	}

	@Override
	public void delete() {
		System.out.println("往oracle的user表中删除一条数据！");
		
	}

}
