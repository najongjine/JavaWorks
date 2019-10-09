package com.biz.classes.user;

public class User03 {
	/*
	 * class 의 변수 scope || 맴버변수 scope
	 */
	//public static int nCount=0;
	public static void count() {
		int nCount=0;
		nCount++;
		System.out.println(nCount+ " 번째 호출");
	}
}
