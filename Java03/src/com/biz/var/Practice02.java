package com.biz.var;

public class Practice02 {

	public static void main(String[] args) {
		double dNum1=0;
		int intNum1=1, intNum2=2;
		
		dNum1=(double)intNum1/intNum2;
		System.out.println(dNum1);
		intNum1=(int)dNum1; //type converter. cascading.
		
		
		int a=2, b=3, c=9, sum=0;
		
		sum=a+b+c;
		double avg=(double)sum/3;
		
		System.out.println("total sum: "+ sum);
		System.out.println("average: " +avg);
		b=9999;
		System.out.printf("b : %d\n", b);
		System.out.printf("b : %5d\n", b);
		
		
	}

}
