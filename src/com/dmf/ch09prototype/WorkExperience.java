package com.dmf.ch09prototype;
/**
 * @author dmf
 * @date 2019年3月18日
 * @Descript 工作经历类
 */
public class WorkExperience implements Cloneable{

	private String workDate;
	private String Company;
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	
	
	public WorkExperience Clone(){
		// TODO Auto-generated method stub
		try {
			return (WorkExperience)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
