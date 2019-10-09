package com.biz.classes.user;

public class User033 {
	/*
	 * class 의 변수 scope || 맴버변수 scope
	 * 
	 * 최초에 한번 count가 호출될때 선언, 생성, 초기화 된후
	 * 더이상 코드가 실행되지 않는다.
	 * 
	 * 
	 */
	public static int nCount=0;
	public static void count() {
		//int nCount=0;
		nCount++;
		System.out.println(nCount+ " 번째 호출");
	}
}
