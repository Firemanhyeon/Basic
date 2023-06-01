package com.yedam.reference;

import java.util.Arrays;
import java.util.Collections;

public class ReferenceEx5 {

	public static void main(String[] args) {
		method1();
	}
	public static void method1(){
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		int tmp=0;
//		제일큰수 intAry 의 첫번째 : 제일큰값 ... 제일 작은값
//		Integer[] v  = {a,b,c};
//		Arrays.sort(v, Collections.reverseOrder());
//		for(int i=0;i<v.length;i++) {
//			System.out.println(v[i]);
//		}
		int [] v = {a,b,c};
		for(int i = 0 ; i<v.length;i++) {
			for(int j = i+1 ; j<v.length;j++) {
				if(v[i]<v[j]) {
					tmp = v[i];
					v[i]=v[j];
					v[j]=tmp;
				}
			}
			System.out.println(v[i]);
		}
	}
}
