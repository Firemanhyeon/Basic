package com.yedam.control;

public class ControlEx1 {

	public static void main(String[] args) {
		//0~1 사이의 임의의 수를 생성
	
			int result = (int)(Math.random()*91)+10;
			String v = "";
			if(result <=100 && result >=90) {
			
					 
				v="A";
			}else if (result>=80 && result <=89) {
				v="B";
			}else if (result >=70 && result <=79) {
				v="C";
			}else {
				v="D";
			}
			System.out.println("점수"+result+"의 등급은"+v+"입니다");
		
			
			
			
		

	}

}
