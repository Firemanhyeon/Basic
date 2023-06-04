package com.yedam.object;

import java.util.Scanner;

class Get {
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	String Product;
	int Price;
}


public class Ex5 {
	static Get[] items ;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	boolean run = true;
	while(run) {
		System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
		int selectNum = Integer.parseInt(sc.nextLine());
		switch(selectNum){
		
		case 1:
			System.out.println("상품수를 입력하세요");
			int num = Integer.parseInt(sc.nextLine());
			items = new Get[num];
			break;
		
		case 2:
			System.out.println("상품및 가격을 입력하세요");
			for(int i = 0 ; i < items.length;i++) {
				
			System.out.println("상품을 입력하세요");
			String pro = sc.nextLine();
			System.out.println("가격을 입력하세요");
			int pri = Integer.parseInt(sc.nextLine());
			Get put = new Get();
			put.setProduct(pro);
			put.setPrice(pri);
			items[i]=put;
			}
			System.out.println("완료");
			break;
			
		case 3:
			for(int i =0 ; i<items.length;i++) {
				System.out.println("상품명: "+ items[i].getProduct()+"가격: "+ items[i].getPrice());
			}
			break;
			
		case 4:
			int sum=0;
			int max=0;
			int sum1=0;
			for(int i = 0; i<items.length;i++) {
				if(max<items[i].getPrice()) {
					max = items[i].getPrice();
				}
				sum+=items[i].getPrice();
			}
			sum1= sum-max;
			System.out.println("최댓값: "+max+"총합에서 최댓값빼기: "+ sum1);
			break;
		
		case 5:
			run=false;
			break;
		}
	}

	}

}
