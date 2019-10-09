package com.biz.classes;

import java.util.Scanner;

public class Prime02 {

	public static void main(String[] args) {
		PrimeService pService=new PrimeService();
		int intNum1=0;
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요(-1 :종료) > ");
			String strNum1=scanner.nextLine();
			intNum1=Integer.valueOf(strNum1);
			if(intNum1<0) break;
			pService.checkPrime(intNum1);
			System.out.println("-----------------------------");
		}
		System.out.println("game over");
	}

}
