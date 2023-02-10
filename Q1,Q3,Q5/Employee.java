package com.collection.api;

public class Employee implements Comparable<Employee>{

	private int empCode;
	private String empName;
	private double empSalary;
	private String empDept;
	
	public Employee() {}

	public Employee(int empCode, String empName, double empSalary, String empDept) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	public int compareTo(Employee otherEmp) {
		if(this.empSalary>otherEmp.empSalary) {
			return 1;
		}
		else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept="
				+ empDept + "]";
	}
	
	
}
