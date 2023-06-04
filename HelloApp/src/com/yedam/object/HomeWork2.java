package com.yedam.object;

import java.util.Scanner;

class Productprice {
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	String product;
	int price;
}

public class HomeWork2 {
	static Scanner sc = new Scanner(System.in);
	static Productprice[] proAry;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			int selectNum = Integer.parseInt(sc.nextLine());
			switch (selectNum) {
			case 1:
				System.out.println("상품 수를 선택하세요");
				int num = Integer.parseInt(sc.nextLine());
				proAry = new Productprice[num];
				break;
			case 2:
				String product;
				int price;
				for (int i = 0; i < proAry.length; i++) {
					Productprice s1 = new Productprice();
					System.out.println("상품 및 가격 입력을 하세요");
					System.out.println("상품입력");
					product = sc.nextLine();
					System.out.println("가격입력");
					price = Integer.parseInt(sc.nextLine());
					s1.setProduct(product);
					s1.setPrice(price);
					proAry[i] = s1;
				}
				break;
			case 3:
				for (int i = 0; i < proAry.length; i++) {
					System.out.println("상품명: " + proAry[i].getProduct());
					System.out.println("가격: " + proAry[i].getPrice());
					System.out.println();
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for (int i = 0; i < proAry.length; i++) {
					if (max < proAry[i].price) {
						max = proAry[i].price;
					}

				}
				for (int a = 0; a < proAry.length; a++) {
					if (proAry[a].price != max) {
						sum += proAry[a].price;
					}
				}
				System.out.println("최고가격제품: " + max);
				System.out.println("최고가격제외제품들 가격총합" + sum);
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다");
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}

		}
	}

}
