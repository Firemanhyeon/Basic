package com.dev;

public class HelloEx {
	public static void main(String[] args) {
		
	com.dev.emp.Hello hello1 = new com.dev.emp.Hello();
	hello1.name="Hong";//클래스 내에서 접근
	hello1.age = 20;//동일한 패키지 내에서 접근
	hello1.height = 170.0;
	
	World world = new World();//
	}
}
