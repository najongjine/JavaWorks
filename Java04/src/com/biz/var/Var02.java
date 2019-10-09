package com.biz.var;

public class Var02 {

	public static void main(String[] args) {
		int intNum1=0, intNum2=0, intCount=0;
		char cA='A';
		String strString1="test";
		
		intCount+=99999;
		cA=(char)(cA+intCount);
		System.out.printf("A문자 이후 %d 번째 문자는 %c 이다. \n"
				+ "ASCII 코드는 %d 이다 \n \n", intCount, cA, (int)cA);
		
		
	}

}
