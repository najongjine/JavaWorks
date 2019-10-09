package com.biz.classes.exec;

public class ClassEx01 {
	static String strName="홍길동";
	
	/*
	 * 프로젝트가 시작하면 JVM이 제일먼저 찾아가서 실행하는 method. 진입점 method.
	 * static으로 설정된 method에서 필드변수에 접근을 하려면
	 * 필드변수도 static으로 선언을 해야한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strName="이몽룡";
		getName(strName);
		System.out.println(strName); // call by value
	}
	
	/*
	 * static으로 선언된 method에서 다른 method를 호출하려면 
	 * 호출되는 method도 모두 static으로 선언되어야 한다.
	 */
	public static void getName(String strName) { //call by value
		strName="성춘향";
	}
}
