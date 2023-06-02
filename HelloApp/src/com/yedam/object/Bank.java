package com.yedam.object;

public class Bank {
	 private String accountNo;//계좌번호 중복된 값이 없어야 한다 //pirvate = 해당클래스 안에서만 쓸수있게 하는명령어
	 private String owner;//계좌주
	 private int balance;//잔고
	 //메소드로 만들기
	public String getAccountNo() {//source -> generate getters and setters 하면 자동으로 매소드 생성해준다
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	 
//	 void setAccountNo(String acNo) {//void: 값을 반환하지않고 내부적으로 처리합니다 
//		 accountNo = acNo;
//	 }
//	 String getAccountNo() {//매개값이 딱히 필요없다
//		 return accountNo;//뱅크클래스안에서 값을 지원한다거나 반환한다 외부에선 쓸수없지만 내부에선 자유롭게 쓸 수 있다
//	 }
//	 void setOwner(String owner) {//괄호안에 들어가는것을 필드(매개변수)라고한다 값을 담아서 실행하고싶다  
//		 this.owner = owner;//매개변수와 클래스안에있는 이름이 같은 경우에 필드의 값이라는걸 정의해주기위해 this를 써준다
//	 }
//	 String getOwner() {
//		 return this.owner;
//	 }
//	 void setBalance(int balance) {
//		 this.balance = balance;
//	 }
//	 int getBalance() {
//		 return this.balance;
//	 }
}
