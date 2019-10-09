package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain01 {

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
		
		grade03.strNum="002";
		grade03.strName="이몽룡";
		grade03.intKor=98;
		grade03.intEng=78;
		grade03.intMath=68;
		
		System.out.println("001 학생의 성적");
		System.out.println("국어: "+grade01.intKor);
		System.out.println("영어: "+grade01.intEng);
		System.out.println("수학: "+grade01.intMath);
		
		int intSum=grade02.intEng+grade02.intKor+grade02.intMath;
		System.out.println("총점: "+intSum);
		
		intSum=grade01.intEng+grade01.intKor+grade01.intMath;
		System.out.println("002 학생의 성적");
		System.out.println("국어: "+grade02.intKor);
		System.out.println("영어: "+grade02.intEng);
		System.out.println("수학: "+grade02.intMath);
		System.out.println("총점: "+intSum);
		
		intSum=grade03.intEng+grade03.intKor+grade03.intMath;
		System.out.println("003 학생의 성적");
		System.out.println("국어: "+grade03.intKor);
		System.out.println("영어: "+grade03.intEng);
		System.out.println("수학: "+grade03.intMath);
		System.out.println("총점: "+intSum);

	}

}
