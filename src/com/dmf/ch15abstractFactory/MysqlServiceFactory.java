package com.dmf.ch15abstractFactory;

public class MysqlServiceFactory implements ServiceFactory{

	@Override
	public UserService createUserService() {
		return new MysqlUserService();
	}

	@Override
	public DepartmentService createDepartmentService() {
		return new MysqlDepartmentService();
	}

}
