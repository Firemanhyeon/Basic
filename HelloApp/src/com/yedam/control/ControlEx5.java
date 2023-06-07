package com.yedam.control;

public class ControlEx5 {

	public static void main(String[] args) {
		//while dowhile
		boolean isTrue=false;
		isTrue = true;
		int sum=0;
		int avg=0;
//		while(isTrue) {
//			System.out.println("print");
//		}
		do {
			System.out.println("do print");
			int result = (int)(Math.random()*6)+1;
			System.out.println(result);
			sum+=result;
			avg++;
			if(sum>100) 
				isTrue = false;				
		}
		while (isTrue);
		System.out.println("end of prog.");
		System.out.println("평균:"+sum/avg);
	}

}
