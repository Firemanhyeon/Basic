package com.dev.emp;

public class HelloEx {
	public static void main(String[] args) {
		
		for(String str : args) {
			System.out.println(str);
		}
		
		Hello hello = new Hello();
//		hello.name = "Hong";//private 타입이라 해당클래스 내에서만 사용가능
		hello.age = 20;//default접근제한자 동일한 패키지 안에서는 접근가능
		hello.height = 179.0;		//public 모든 패키지 안에서 접근가능	
		
		World world = new World();
		System.out.println("end of prog");
}
}
