package com.dmf.ch15abstractFactory;

public class OracleDepartmentService implements DepartmentService{

	@Override
	public void insert() {
		System.out.println("往oracle的department表中插入一条数据！");
		
	}

	@Override
	public void delete() {
		System.out.println("往oracle的department表中删除一条数据！");
		
	}

}
