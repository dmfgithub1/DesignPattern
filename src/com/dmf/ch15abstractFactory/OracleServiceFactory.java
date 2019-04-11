package com.dmf.ch15abstractFactory;

public class OracleServiceFactory implements ServiceFactory{

	@Override
	public UserService createUserService() {
		return new OracleUserService();
	}

	@Override
	public DepartmentService createDepartmentService() {
		// TODO Auto-generated method stub
		return new OracleDepartmentService();
	}

}
