package com.dmf.ch15abstractFactory;

public interface ServiceFactory {

	public UserService createUserService();
	public DepartmentService createDepartmentService();
}
