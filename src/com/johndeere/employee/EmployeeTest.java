package com.johndeere.employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee.companyName="JohnDeere";
		
		Employee emp1=new Employee(101, "John");
		System.out.println(emp1);
		
		Employee emp2=new Employee(102);
		Employee emp3=new Employee(103);
		
		Employee emp4= Employee.getEmployeeInstance();
		Employee.printEmployeeId(emp4);
		
		Employee.printEmployeeId(Employee.getEmployeeInstance());
		
		//emp1.empId=101;
		emp1.empName="Saul";
		//emp1.empSalary=8000.33;
		emp1.setEmpSalary(89935.5);
		
		//emp2.empId=102;
		emp2.empName="Peter";
//		emp2.empSalary=8002;
		emp2.setEmpSalary(4002);
		
		//create 3rd object and store (103, Kim, 4000.86, JohnDeere) 
		//emp3.empId=103;
		emp3.empName="Kim";
//		emp3.empSalary=9800;
		emp3.setEmpSalary(9800.2);
		
		String myName= Employee.getAuthorName();
		System.out.println(myName);
		
		emp1.printEmployeeDetail();
		emp2.printEmployeeDetail();
		emp3.printEmployeeDetail();
		
		int id=emp1.getEmpId();
		System.out.println(id);
		
		System.out.println(emp2.getEmpId());
		
		//Employee[] employees=new Employee[3];
//		employees[0]=emp1;
	}

}
