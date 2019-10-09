package com.biz.classes;

import java.util.Scanner;

public class PrimeService {

	public void checkPrime(int num) {
		int intNum1=num;
		
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
