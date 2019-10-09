package com.biz.for_if;

public class If03 {

	public static void main(String[] args) {
		int intNum1=3*4*2;
		
		if(intNum1%3==0) {
			// 3의 배수다
			System.out.println(intNum1 + " 는 3의 배수다");
		}
		if(intNum1%4==0) {
			//4의 배수
			System.out.println(intNum1 + " 는 4의 배수다");
		}
		if(intNum1%2==0) {
			//2의 배수
			System.out.println(intNum1 + " 는 2의 배수다");
		}
		else {
			//2,3,4 의 배수가 아님
			System.out.println(intNum1 + " 는 2,3,4의 배수가 아니다");
		}

	}

}
