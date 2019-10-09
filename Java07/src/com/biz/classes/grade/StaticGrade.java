package com.biz.classes.grade;
/*
 * 어떤 클래스를 만들고 맴버변수, 메서드에 한개라도 static이라는 
 * 키워드를 붙이면 class가 static class가 된다
 * 
 * Run하면 JVM아 메모리 어딘가에 생성,초기화.... 사용할수 있는 준비를 함.
 * new name(); 할 필요가 없음.
 */
public class StaticGrade {
	//맴버변수들
	public static String strNum;
	public static String strName;
	public static int intKor;
	public static int intEng;
	public static int intMath;
	
	public static void sum() {
		//StaticGrade 클래스의 sum() method 몸체 부분
		int sum=intEng+intKor+intMath;
		System.out.println("총점: "+sum);
	}
}
