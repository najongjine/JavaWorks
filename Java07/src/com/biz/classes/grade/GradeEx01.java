package com.biz.classes.grade;

import java.util.Scanner;

public class GradeEx01 {

	public static void main(String[] args) {
		String strNum="", strName="";
		String strKor="", strEng="", strMath="";
		Scanner scanner=new Scanner(System.in);
		GradeVO grade01=new GradeVO();
		
		System.out.print("학번 > ");
		strNum=scanner.nextLine();
		grade01.strNum=strNum;
		
		System.out.print("이름 > ");
		strName=scanner.nextLine();
		grade01.strName=strName;
		
		/*
		* strKor에는 문자열형 숫자가 담겨있음.
		* scanner.nextline() 메서드는 키보드로 입력한 모든것을 
		* 문자열로 변환하여 입력받기 때문에
		 */
		System.out.print("국어 > ");
		strKor=scanner.nextLine();
		grade01.intKor=Integer.valueOf(strKor);
		
		System.out.print("영어 > ");
		strEng=scanner.nextLine();
		grade01.intMath=Integer.valueOf(strMath);
		
		System.out.print("수학 > ");
		strMath=scanner.nextLine();
		grade01.intMath=Integer.valueOf(strMath);
		
		grade01.sum();
	}

}
