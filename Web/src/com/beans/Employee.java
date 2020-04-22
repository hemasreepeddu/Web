package com.beans;

public class Employee {
	private int EmployeeID;
	private String EmployeeName,Address;
	private int Mobile;
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMobile() {
		return Mobile;
	}
	public void setMobile(int mobile) {
		Mobile = mobile;
	}
	public Employee(int employeeID, String employeeName, String address, int mobile) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		Address = address;
		Mobile = mobile;
	}
	
}
