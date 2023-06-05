package com.yedam.insa;

import java.util.Scanner;

//사원정보 배열 , 등록/조회/출력 정의하는클래스
public class EmpList {
	//싱글톤---------------------------
//	private static EmpList instance=new EmpList();
//	public static EmpList getInstance() {
//		return instance;
//	}
	//--------------------------
	
	
	//정보저장공간배열생성
	Employee[] list ;
	int empNum;//사원수
	Scanner sc = new Scanner(System.in);
	
	//생성자: 
	EmpList(){}//기본생성자
	EmpList(Employee[]list){
		this.list = list;
		this.empNum = list.length;
	}
	
	//사원수 입력 메소드
	public void init() {
		System.out.print("사원수> ");
		int num = sc.nextInt();
		list=new Employee[num];
		
	}
	//사번,이름 , 급여 등록메소드
	public void input() {
		if(empNum >= list.length) {
			System.out.println("입력초과");
			return;
		}
		System.out.printf("%d 사번>",empNum);
		int no = sc.nextInt();
		System.out.print("이름");
		String name = sc.next();//Enter까지 먹음
		System.out.print("급여>");
		int sal = sc.nextInt();
		
		list[empNum++] = new Employee(no,name,sal);
	}
	// 조회 메소드
	public String search (int employeeId) {
			
		for(int i = 0 ;  i<list.length;i++) {
			if(list[i]!=null) {
			if(list[i].getEmployeeId()==employeeId) {
				return list[i].getName();
			}
			}
		}
		return "";
	}
	//출력 메소드
	public void print() {
		for(int i =0 ; i <list.length;i++) {
			if(list[i]!=null) {
				
			System.out.printf("%5d %10s %7d\n",list[i].getEmployeeId(),list[i].getName(),list[i].getSalary());
			}
		}
	}
	//급여합계메소드 public sum 은 리턴값을 줘야하고 public void sum은 리턴값없이 바로 print문으로 넘어가서 호출문에선 호출만 해줘야함
	public void sum() {
		int sum = 0;
		for(int i = 0; i<list.length;i++) {
			sum+= list[i].getSalary();
		}
		System.out.println(sum);
		
	}
}
