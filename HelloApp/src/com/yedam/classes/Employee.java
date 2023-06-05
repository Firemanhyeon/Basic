package com.yedam.classes;

public class Employee {
	//필드
	private int employeeId;
	private String firstName;
	private String lastName;
	private Department dept;
	
	//생성자.
	Employee(){}
	
	Employee(int employeeId, String firstName){//사원번호와 성만 선언하기위한 생성자새엉
		this.employeeId = employeeId;
		this.firstName = firstName;
	}
	
	Employee(int employeeId,String firstName, String lastName , Department dept){
		this(employeeId , firstName);//위에 this호출해서 두개생성자는 이걸로대체가능
		this.lastName = lastName;//this 키워드 생성자 가리키는 
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", dept="
				+ dept + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
}
