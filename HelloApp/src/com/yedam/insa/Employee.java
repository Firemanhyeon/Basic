package com.yedam.insa;

public class Employee {
	private int employeeId;//사번
	private String name;//이름
	private int departmentId;//부서번호:10(인사),20(개발),30(영업:기본값)
	private String departmentName;//부서명
	private int salary;//급여
	private String email;//이메일


	//기본생성자
	Employee(){}
	//정수,문자열,정수,정수 이 타입으로 생성자 호출하면 
	
	Employee(int employeeId,String name , int salary , int departmenId){
		
		this.employeeId = employeeId;
		this.name = name;
		this.salary=salary;
		this.departmentId=departmentId;
		if(departmentId ==10) {
			departmentName = "인사";
		}
		else if(departmentId ==20) {
			departmentName = "개발";
		}
		else {
			departmentName = "영업";
		}
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", departmentId=" + departmentId
				+ ", departmentName=" + departmentName + ", salary=" + salary + ", email=" + email + "]";
	}

	Employee(int employeeId ,String name){
		this(employeeId,name,0,30); //employeeid 와 name 만 있으면 급여는 0 departmentid는 30번으로 하겠습니다
		
	}
	Employee(int employeeId, String name , int salary){
	this(employeeId,name,salary,30);
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDepartmentId() {
	return departmentId;
}

public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
}