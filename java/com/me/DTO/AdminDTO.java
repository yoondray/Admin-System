package com.me.DTO;

import java.util.ArrayList;

public class AdminDTO {
	//Data Transfer Object
	
	private String empNo;
	private String empPw;
	private String eName;
	private String job;
	private String hireDate;
	private int salary;
	private int deptNo;
	private String dName;
	
	//private ArrayList<DeptDTO> deptList;
	

	
	public String getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "AdminDTO [empNo=" + empNo + ", empPw=" + empPw + ", eName=" + eName + ", job=" + job + ", hireDate="
				+ hireDate + ", salary=" + salary + ", deptNo=" + deptNo + ", dName=" + dName + "]";
	}



	
	
	
}

