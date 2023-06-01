package com.yedam.reference;

public class ReferenceEx4 {

	public static void main(String[] args) {
		String[] strAry = {"홍길동","김민수","최수민"};
		strAry[0]="Hong";
		strAry = new String[] {"Hong","Kim","choi"};
		
//		for(String a : strAry) {
//			System.out.println(a);
//		}
		
		for(int i =0; i<strAry.length;i++) {
			if(strAry[i].equals("Kim")){
				System.out.printf("%s는 %d번째에 있습니다",strAry[i],i+1);
			}
		}System.out.println();
		
		String s1 = "Hongkildong";
		char first = s1.charAt(0);
		System.out.println(first);
		
		int result1=s1.indexOf("k");
		System.out.println(result1);
		
		//String 배열에 주민번호 , 950304-1234567, 950404-2234567
		String[] idAry = {"950304-1234567","950404-2234567"};
		for(int i = 0; i< idAry.length;i++) {
			
		
		if( idAry[i].charAt(7) == '1') {
			System.out.println("남자입니다");
		}else if (idAry[i].charAt(7)== '2') {
			System.out.println("여자입니다");
		}
		}
	}

}
