package com.beans;

public class Department {
	private int DepartmentID;
	private String DepartmentName;
	public int getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public Department(int departmentID, String departmentName) {
		super();
		DepartmentID = departmentID;
		DepartmentName = departmentName;
	}
	
}
