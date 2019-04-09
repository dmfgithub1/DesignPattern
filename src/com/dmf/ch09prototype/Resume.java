package com.dmf.ch09prototype;
/**
 * @author dmf
 * @date 2019年3月18日
 * @Descript 简历类
 */
//克隆的对象必须实现Cloneable这个接口
public class Resume implements Cloneable{

	private String name;
	private String age;
	private String sex;
	private WorkExperience work;

	
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	private Resume (WorkExperience work) {
		this.work = work.Clone();
	}
	
	public void setPersonalInfo(String sex,String age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String workDate,String company) {
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	
	public void Display() {
		System.out.println(name + " " + sex + " " + age);
		System.out.println("Work experience: " + work.getWorkDate() + " " + work.getCompany());
	}


	public Resume Clone(){
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;

	}
	
	
}
