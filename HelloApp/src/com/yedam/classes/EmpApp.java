package com.yedam.classes;

//사원정보를 저장
//사원클래스(Employee) - 부서 클래스 선언(Department) 
public class EmpApp {
	public static void main(String[] args) {
		Department dept1 = new Department(10, "인사" , 120);//직접 생성자에 넣는ㄴ방법
		dept1.setDepartmentId(10);//하나하나지정해주는방법
		dept1.setDepartmentName("인사");
		dept1.setManagerId(120);
		Department dept2 = new Department(20,"기획");//부서번호와  부서명은 지정은 되었지만 부서장은 지정되지않았다.
		dept2.setManagerId(130);
		System.out.println(dept1.toString());
		System.out.println(dept2.toString());
		
		//사원등록 emploee class참조
		Employee emp1 = new Employee();//기본생성자를 써놨기때문에 쓸 숫 있다
		emp1.setEmployeeId(200);
		emp1.setFirstName("길동");
		emp1.setLastName("홍");
		emp1.setDept(dept1);
		
		System.out.println(emp1.getDept().getDepartmentName());
		
		Employee emp2 = new Employee(201,"민수","김", dept1);//이렇게도할수있다
		
		Employee emp3 = new Employee(203, "이수", "김", new Department(30,"개발",150));//부서넣는 란에 new department를 통해 새로 지정할수도 있다.
	}
}
