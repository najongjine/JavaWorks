package com.biz.keyInput;

import java.util.Scanner;

public class KeyInput02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("----------회원가입---------");
		System.out.print("이름 > ");
		String strName=scanner.nextLine();
		System.out.print("전화번호 > ");
		String strPhoneNum=scanner.nextLine();
		System.out.print("주소 > ");
		String strAddress=scanner.nextLine();
		System.out.println("----------------------");
		System.out.println("----회원가입을 환영합니다---");
		System.out.println("이름: " +strName);
		System.out.println("전화번호: " +strPhoneNum);
		System.out.println("주소: " +strAddress);
		System.out.println("-------------------------");
		

	}

}
