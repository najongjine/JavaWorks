package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain03 {

	public static void main(String[] args) {
		GradeVO grade01=new GradeVO();
		GradeVO grade02=new GradeVO();
		GradeVO grade03=new GradeVO();
		GradeVO grade04=new GradeVO();
		GradeVO grade05=new GradeVO();
		GradeVO grade06=new GradeVO();
		GradeVO grade07=new GradeVO();
		//grade01 객체의 맴버변수에 값을 셋팅한다
		grade01.strNum="001";
		grade01.strName="홍길동";
		grade01.intKor=99;
		grade01.intEng=88;
		grade01.intMath=77;
		
		grade02.strNum="002";
		grade02.strName="이몽룡";
		grade02.intKor=88;
		grade02.intEng=66;
		grade02.intMath=78;
		
		grade03.strNum="003";
		grade03.strName="성춘형";
		grade03.intKor=98;
		grade03.intEng=78;
		grade03.intMath=68;
		
		grade04.strNum="004";
		grade04.strName="성운이";
		grade04.intKor=78;
		grade04.intEng=78;
		grade04.intMath=68;
		
		grade05.strNum="005";
		grade05.strName="박춘형";
		grade05.intKor=98;
		grade05.intEng=98;
		grade05.intMath=68;
		
		grade06.strNum="006";
		grade06.strName="김춘형";
		grade06.intKor=68;
		grade06.intEng=78;
		grade06.intMath=68;
		
		grade07.strNum="007";
		grade07.strName="오춘성";
		grade07.intKor=98;
		grade07.intEng=78;
		grade07.intMath=98;
		
		System.out.println("--------------------------");
		System.out.println("응용SW 성적표");
		System.out.println("---------------------------");
		System.out.println("학번\t이름\t영어\t국어\t수학\t총점");
		System.out.println("--------------------------------");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		grade04.gradeList();
		grade05.gradeList();
		grade06.gradeList();
		grade07.gradeList();
		System.out.println("---------------------------------");

	}

}
