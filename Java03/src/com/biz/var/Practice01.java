package com.biz.var;

public class Practice01 {

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
		b=0;
		System.out.println("---------99단----------");
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println(a + "*" + ++b + "=" + (a*b));
		System.out.println("----------------------");
		System.out.printf("\n\n\n");
		
		
		
	}

}
