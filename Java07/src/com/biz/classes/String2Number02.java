package com.biz.classes;

public class String2Number02 {

	public static void main(String[] args) {
		String strNum="33";
		System.out.println(Integer.valueOf(strNum));
		
		
		/*
		 * 문자열형 숫자를 숫자로 바꿀때 앞 뒤 중간에 문자, 빈칸
		 * 등이 있으면 숫자로 변환하지 못한다.
		 */
		String strNum2="33 ";
		System.out.println(Integer.valueOf(strNum2));
		
		String strNum3=" 33";
		System.out.println(Integer.valueOf(strNum3));
		
		String strNum4="ㅁ39";
		System.out.println(Integer.valueOf(strNum4));
		
		String strNum5="39a";
		System.out.println(Integer.valueOf(strNum5));

	}

}
