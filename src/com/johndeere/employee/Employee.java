package com.johndeere.employee;

public class Employee {

	private int empId; // non-static variable or instance variable
	public String empName;
	private double empSalary;
	public static String companyName; // static variable or class variable

//	public String toString() {
//		return "Balaji";
//	}

	public Employee() {
		System.out.println("object created!!");
	}

	public Employee(int empId) {
		System.out.println("object created!!");
		System.out.println("launch browser!!");
		this.empId = empId;
	}

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public Employee(String empName, int empId) {
		this.empId = empId;
		this.empName = empName;
	}

	public static Employee getEmployeeInstance() {
		Employee e = new Employee();
		return e;
	}

	public static void printEmployeeId(Employee e) {
		System.out.println(e.empId);
	}

	public int getEmpId() {
		return empId;
	}

	public static String getAuthorName() {
		return "Balaji Dinakaran";
	}

	public void printEmployeeDetail() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + getEmpSalary());
		System.out.println("Company Name: " + Employee.companyName);
		System.out.println("-----------------------------------------------");
	}

	// read
	public double getEmpSalary() {
		return empSalary;
	}

	// write
	public void setEmpSalary(double empSalary) {
		if (empSalary > 5000) {
			this.empSalary = empSalary;
		} else {
			System.out.println("Employee salary should be greater than 5000");
		}
	}
}
