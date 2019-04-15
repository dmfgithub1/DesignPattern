package com.dmf.ch19composite;
/**
 * @author: dmf
 * @date: 2019年4月15日
 * @description: 叶子节点 Leaf
 */
public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void Add(Company c) {
		
	}

	@Override
	public void Remove(Company c) {
		
	}

	@Override
	public void Display(int depth) {
		System.out.println("-" + name);
	}

	@Override
	public void LineOfDuty() {
		System.out.println(name + " staffs' trainning and managing");
	}

}
