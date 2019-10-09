package com.biz.classes;

import java.util.Scanner;

public class Prime01 {

	public static void main(String[] args) {
		int intNum1=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		String strNum1=scanner.nextLine();
		intNum1=Integer.valueOf(strNum1);
		
		int index=0;
		for(index=2; index<intNum1; index++) {
			if(intNum1%index==0) {
				break;
			}
		}
		if(index>=intNum1) {
			System.out.println(intNum1+"은 소수 입니다");
		}
		else {
			System.out.println(intNum1+ "은 소수가 아닙니다");
		}
	}

}
