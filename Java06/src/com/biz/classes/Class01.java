package com.biz.classes;
/*
 * static method가 아니므로 객체로 먼저 선언 해야함
 * method 이름의 첫글자는 소문자
 * 객체 이름도 첫글자 소문자 & Class 이름과 같게
 * 
 */
public class Class01 {
	public String strMember="나는 맴버 변수";
	public void method01() {
		System.out.println("나는 Class01의 method 01 입니다");
		System.out.println(strMember);
	}
	public void method02() {
		System.out.println("나는 Class01의 method 02 입니다");
		System.out.println("222222222222");
	}
	public void method03() {
		System.out.println("나는 Class01의 method 03 입니다");
		System.out.println("33333");
		System.out.println("333333333");
	}
}
