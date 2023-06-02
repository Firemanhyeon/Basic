package com.yedam.object;

//메소드에 대해서
//메인메소드 : 클래스가실행되는시점에 메소드들도 같이 실행하고싶으면 static 을 붙인다
//두개의 정수 식과 더해서 더한 결과를 반환하는 기능을하는메소드를 만들고싶다 . 
// 
//static < - > instance
public class ObjectEx5 {

	public static void main(String[] args) {//
		int num1 = 10;
		int num2 = 20;

		int result = sum(num1, num2);
		double result1 = div(num1, num2);
		System.out.println(result);
		result = sum(new int[] { 1, 2, 3 });
		makePerson("홍길동",24);
		System.out.println("======================");
		int[]resultAry = makeAry(10);
		for(int num : resultAry) {
			System.out.println(num);
		}
		System.out.println("==============");
//	ObjectEx5 o1 = new ObjectEx5();//실제 메모리에 로딩 실체가 있다 라는 의미 인스턴스생성이라고한다 
//	int result = o1.s0um(num1, num2);
	}

	// 더하기 메소드
	// instance method
	// method overloading;
	public static void showNumber(int[]ary) {   //반환값이 없는경우 void 써주고 return도 안쓴다.
		for(int num : ary) {
			System.out.println(num);
		}
	}
	
	public static Person makePerson(String name , int age) {//person 클래스형 메소드 생성
		return new Person(name , age);
	}
	
	public static int[] makeAry(int size) {//배열형 메소드생성
		int[]ary =new int[size];
		for(int i = 0 ; i <ary.length;i++) {
			ary[i]=(int)(Math.random()*10);
		}
		return ary;
	}
	public static int sum(int a, int b) {// static이 없으면 오브젝트 클래스를 하나 호출해야 sum 메소드 사용가능
											// static 있으면 인스턴스 생성 안하고 바로 쓸 수 있다.
		return a + b;						
	}

	public static double sum(int m, double n) {//method overloading;
		
		return (double)m + n;
	}

	public static int sum(int[] ary) {
		int result = 0;
		for (int num : ary) {
			result += num;
		}
		return result;
	}

	// 나누기하는메소드만들기
	public static double div(int n1, int n2) {
		return (double) n1 / n2;
	}
}
