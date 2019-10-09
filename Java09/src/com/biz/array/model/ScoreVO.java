package com.biz.array.model;

public class ScoreVO {
	public String strNum;
	public int intKor;
	public int intEng;
	public int intMath;
	
	private int intSum;
	private float fAvg;
	private int intRank;
	
	public ScoreVO() {
		strNum="";
		intKor=-1;
		intEng=-1;
		intMath=-1;
		intSum=-1;
		fAvg=-1.0f;
		intRank=-1;
	}
	
	public int total() {
		//intSum=0;
		intSum=intEng+intKor+intMath;
		return intSum;
	}
	public double avg() {
		//fAvg=0.0f;
		fAvg=intSum/3f;
		return fAvg;
	}
	public void view() {
		System.out.println("-----------------------------------");
		System.out.println("학번: "+strNum);
		System.out.println("수학점수: "+intMath);
		System.out.println("국어점수: "+intKor);
		System.out.println("영어점수: "+intEng);
		System.out.println("총점: "+intSum);
		System.out.printf("평균: %2.2f \n", fAvg);
		System.out.println("순위: "+intRank);
		System.out.println("------------------------------------");
	}
}
