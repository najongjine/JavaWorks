package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain02 {

	public static void main(String[] args) {
		GradeVO grade01=new GradeVO();
		//grade01 객체의 맴버변수에 값을 셋팅한다
		grade01.strNum="001";
		grade01.strName="홍길동";
		grade01.intKor=99;
		grade01.intEng=88;
		grade01.intMath=77;
		
		GradeVO grade02=new GradeVO();
		
		grade02.strNum="002";
		grade02.strName="이몽룡";
		grade02.intKor=88;
		grade02.intEng=66;
		grade02.intMath=78;

		GradeVO grade03=new GradeVO();
		
		grade03.strNum="003";
		grade03.strName="성춘형";
		grade03.intKor=98;
		grade03.intEng=78;
		grade03.intMath=68;
		
		System.out.println("--------------------------");
		System.out.println("응용SW 성적표");
		System.out.println("---------------------------");
		System.out.println("학번\t이름\t영어\t국어\t수학\t총점");
		System.out.println("--------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		System.out.println("---------------------------------");

	}

}
