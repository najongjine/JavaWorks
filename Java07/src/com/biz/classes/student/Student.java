package com.biz.classes.student;

/*
 * 한개의 클래스(파일)에는 특별한 경우가 아니면 한개의 클래스만
 * method 외의 부분에선 명령문, 계산식등 어떠한 것도 있어선 안된다.
 */

public class Student {
	public String strStudentNum="";
	public String strName="";
	public int intEnrolledYear=0;
	public String strMajor="";
	
	public void studentPersonalInfo() {
	
		System.out.println("------------ 학생의 개인정보----------------");
		System.out.println("학번: "+ strStudentNum);
		System.out.println("이름: "+ strName);
		System.out.println("입학년도: " +intEnrolledYear);
		System.out.println("전공: " + strMajor);
		System.out.println("학년: " +(2019-intEnrolledYear +1));
		System.out.println("---------------------------------------------");
	}
	
	public void studentList() {
	
		System.out.print("학번: "+strStudentNum+"\t");
		System.out.print(strName+"\t");
		System.out.print((2019-intEnrolledYear +1)+"학년\t");
		System.out.print(strMajor +"\t");
		System.out.print("입학년도: " +intEnrolledYear +"\t");
		System.out.println();
	}
}
