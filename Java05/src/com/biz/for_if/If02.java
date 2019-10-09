package com.biz.for_if;

public class If02 {

	public static void main(String[] args) {
		int intEvenNumTotal=0;
		for(int i=1; i<=100; i++) {
			if(i%2 ==0) {
				intEvenNumTotal+=i;
			}
			
		}
		
		System.out.println("1~100 까지 짝수들의 합: " + intEvenNumTotal);
	}

}
