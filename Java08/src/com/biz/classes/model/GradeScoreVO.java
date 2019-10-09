package com.biz.classes.model;
/*
 * 학생의 성적ㄷ처리에 사용할 VO Cass Design
 * prototype(코드) 작성
 * 객체를 생성하는 근본코드
 * 맴버변수를 모아두는게 주 목적인 클래스
 */
public class GradeScoreVO {
	//학번, 국어점수 영어점수 수학점수, 총점, 평균
	public String strStudentNum;
	public int intKor;
	public int intEng;
	public int intMath;
	public int intSumScore;
	public double dAvg;
	
	public void total() {
		intSumScore=intEng+intKor+intMath;
	}
	public void average() {
		dAvg=(double)intSumScore/3;
	}
	public void viewScoreList() {
		//System.out.printt("%d");
	}
}
