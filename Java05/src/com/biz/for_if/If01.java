package com.biz.for_if;

public class If01 {

	public static void main(String[] args) {
		boolean bVar=true;
		int intNum1=5;
		if(intNum1%2==0) {
			System.out.println(intNum1 + " is even number.");
		}
		else if(intNum1 %2 != 0) {
			System.out.println(intNum1 + " is odd number.");
		}
		
		for(int i=0; i<=100; i++) {
			if(i%2 ==0) {
				System.out.println(i + " is even number.");
			}
			else if(i%2!=0) {
				System.out.println(i + " is odd number.");
			}
		}

	}

}
