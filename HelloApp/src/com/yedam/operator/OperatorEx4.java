package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {

	public static void main(String[] args) {
			int result = 0;
			System.out.println("값을 입력하세요");
			while(true) {
		
			try {
			result = System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
				if(result== 113) {
					break;
				}else if(result==13||result==10){
					continue;
					
				}else if(result > 64 && result<91 ){
					System.out.println("입력한 값은 대문자입니다");
					break;
				}
				else if(result >96 && result<123 ) {
					System.out.println("입력한 값은 소문자입니다");
					break;
				}else if(result >47 && result <58) {
					System.out.println("입력한 값은 숫자 입니다");
					break;
				}else {
					System.out.println("기타 값 입니다");
					break;
				}
				

			}
			System.out.println("아스키코드값"+result);
			System.out.println("끝");
	}

}
