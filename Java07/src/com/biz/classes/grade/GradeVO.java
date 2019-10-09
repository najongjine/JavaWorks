package com.biz.classes.grade;
/*
 * dynamic class라고 불림. 그냥 dynamic 뜻으로 해석하면 어려움
 * static이 아닌 클래스라고 이해해야함
 */
public class GradeVO {
	/*
	 * 객체의 정의
	 * 1. 연산을 통해서 얻을수 없는 데이터
	 * 	(ex:학번, 이름, 과목점수) 변수로 정의하는 단계 :=맴버변수
	 * 2. 맴버변수를 기초로하여 연산을 통해서 얻을수 있는 항목들을 위하여
	 * 	method를 정의
	 * 3. 처리하고자 하는 대상(데이터...)을 객체로 정의하는 단계를 '추상화라고 한다. 
	 */
	public String strNum;
	public String strName;
	public int intKor;
	public int intEng;
	public int intMath;
	
	public void sum() {
		int sum=intEng+intKor+intMath;
		System.out.println("총점: "+sum);
		System.out.println("평균: "+sum/3);
	}
	public void gradeList() {
		System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\n", strNum,strName,
				intEng,intKor,intMath,intEng+intKor+intMath);
	}
}
