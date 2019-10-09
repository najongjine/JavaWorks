package com.biz.classes;

import com.biz.classes.grade.GradeVO;
import com.biz.classes.grade.StaticGrade;
import com.biz.classes.student.Student;

public class StartMain {
	/*
	 * static classs는
	 * 선언, 생성, 초기화 과정을 코딩하지 않고
	 * 직접 Class.~~~ 방식으로 접근할수 있다
	 */

	public static void main(String[] args) {
		
		Student student01=new Student();
		student01.intEnrolledYear=2018;
		student01.strMajor="컴과";
		student01.strName="김씨";
		student01.strStudentNum="001";
		student01.studentList();
		student01.studentPersonalInfo();
		
		StaticGrade.strNum="001";
		StaticGrade.strName="홍길동";
		StaticGrade.intKor=90;
		StaticGrade.intEng=88;
		StaticGrade.intMath=77;
		
		StaticGrade.sum();
		
		/*
		 * non-static class는 반드시 접근 전에 대리자를
		 * 선언, 생성, 초기화 과정을 코딩해야 한다.
		 * 
		 * 대리자:= 객체|object|instance
		 * 대리자는 클래스의 복제품이다.
		 * 
		 * 대리자가 선언, 생성, 초기화 되면 대리자는 일반 변수와
		 * 비슷한 방식으로 사용 된다.
		 */
		GradeVO grade01=new GradeVO();
		grade01.strNum="002";
		grade01.strName="성춘향";
		grade01.intKor=99;
		grade01.intEng=99;
		grade01.intMath=99;
		
		grade01.sum();
		
		/*
		 * grade01과 마찬가지로 GradeNew의 복제자 이지만 전혀 별개의
		 * 메모리 장소에 존재.
		 * grade01과는 관계, 영향이 전혀 없다.
		 */
		GradeVO grade02=new GradeVO();
	}

}
