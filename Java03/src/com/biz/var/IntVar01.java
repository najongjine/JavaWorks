package com.biz.var;
/*
 * 클래스는 .java 라는 자바 소스코드 파일이다.
 */
public class IntVar01 {
	public static void main(String[] args) {
		//한개의 EQ(=) 기호가 있으면 명령문에서 항상 오른쪽을 먼저 바라본다.
		int intNum1=0;
		long longNum1=0l;
		
		intNum1=30%4; // modular 연산. 나머지 연산
		/*
		 * 어떤 값을 3으로 나누면 나머지는 0~2 까지가 나옴.
		 */
		System.out.println(intNum1);
		
		intNum1=57;
		System.out.println("57/3="+(57/3));
		System.out.println("57%3="+(57%3));
		
		float fNum1 =30, fNum2=22.1f;
		
		System.out.println(fNum1);
		
		double dNum1=23.0, dNum2=35.0;
		dNum1=3/5;
		System.out.println(dNum1/dNum2);
		
		int a=2, b=3, c=9, sum=0;
		
		sum=a+b+c;
		double avg=(double)sum/3;
		
		System.out.println("total sum: "+ sum);
		System.out.println("average: " +avg);
	}
}
