package com.dmf.ch19composite;

import java.util.ArrayList;
import java.util.List;
/**
 * @author: dmf
 * @date: 2019年4月15日
 * @description: 枝节点Composite
 */
public class ConcreteCompany extends Company {

	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void Add(Company c) {
		children.add(c);
	}

	@Override
	public void Remove(Company c) {
		children.remove(c);
	}

	@Override
	public void Display(int depth) {

		System.out.println("-" + name);
		for (Company c : children) {
			for (int i = 0; i < depth; i++) {
				System.out.print("--");
			}
			c.Display(depth + 2);
		}

	}

	@Override
	public void LineOfDuty() {
		for (Company c : children) {
			c.LineOfDuty();
		}
	}

}
