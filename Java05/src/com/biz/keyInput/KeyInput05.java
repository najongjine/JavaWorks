package com.biz.keyInput;

import java.util.Scanner;

public class KeyInput05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner 클래스를 객체로 만들면서 new Scanner() 생성자에게 System.in
		 * 을 연결했음.
		 * 의존성 주입(Depenrency Injection) 이라고 한다.
		 */
		Scanner scanner=new Scanner(System.in);
		
		String strList="";
		for(int i=0; i<3; i++) {
			System.out.println("-----------------");
			System.out.println((i+1) + "번째 학생");
			System.out.println("-----------------");
			System.out.print("국어 > ");
			String strKor=scanner.nextLine();
			System.out.print("영어 > ");
			String strEng=scanner.nextLine();
			System.out.print("수학 > ");
			String strMath=scanner.nextLine();
			System.out.println("");
			strList+=(i+1) + "\t";
			strList+=strKor+"\t";
			strList+=strEng+"\t";
			strList+=strMath+"\n";
		}
		System.out.println("--------------------------");
		System.out.println("성적표");
		System.out.println("-----------------------------");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println(strList);
		System.out.println("-----------------------------");

		

	}

}
