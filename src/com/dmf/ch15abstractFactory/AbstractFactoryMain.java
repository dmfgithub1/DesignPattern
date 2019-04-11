package com.dmf.ch15abstractFactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {

		System.out.println("使用mysql数据库！");
		ServiceFactory factory = new MysqlServiceFactory();
		UserService userservice = factory.createUserService();
		userservice.insert();
		userservice.delete();
		DepartmentService departService = factory.createDepartmentService();
		departService.insert();
		departService.delete();
		
		System.out.println("使用oracle数据库！");
		ServiceFactory factory1 = new OracleServiceFactory();
		UserService userservice1 = factory1.createUserService();
		userservice1.insert();
		userservice1.delete();
		DepartmentService departService1 = factory1.createDepartmentService();
		departService1.insert();
		departService1.delete();
		
		//在实际使用过程中，为了更加灵活，可以使用配置文件+反射来生成Service工厂。
		System.out.println("根据配置文件来决定使用哪个数据库：");
		ServiceFactory factory2 = DataUtil.createService();
		
		UserService userservice2 = factory2.createUserService();
		userservice2.insert();
		userservice2.delete();
		DepartmentService departService2 = factory2.createDepartmentService();
		departService2.insert();
		departService2.delete();
	}

}
