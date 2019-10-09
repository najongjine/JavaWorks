package com.biz.classes;

public class String2Number01 {
	public static void main(String[] args) {
		String strNum1="30";
		String strNum2= 40+"";
		String strNum3="30.0";
		String strNum4="30.24";
		
		int intNum1=Integer.valueOf(strNum1);
		int intNum2=Integer.valueOf(strNum2);
		
		double dNum3= Double.valueOf(strNum3);
		double dNum4=Double.valueOf(strNum4);
		
	
		System.out.println(dNum3+dNum4);
	}
}
