package com.biz.classes.service;
/*
 * 뭐뭐service Class
 * 데이터를 활용하여 다양한 연산을 수행하는 클래스들을 지칭하는 접미사
 */

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

public class GradeScoreService {
	private GradeScoreVO[] gradeScoreVO;
	//현 클래스내의 method에서만 member변수를 접근할수있음
	
	public void newVO(int length) {
		//length만큼 GradeScoreVO배열을 만들어서 gradeScoreVO에 할당한다
		gradeScoreVO=new GradeScoreVO[length];
		
	}
	public void makeScore() {
		Random rnd=new Random();
		
		for(int i=0;i<gradeScoreVO.length;i++ ) {
			gradeScoreVO[i]=new GradeScoreVO();
			gradeScoreVO[i].intEng=rnd.nextInt(100)+1;
			gradeScoreVO[i].intKor=rnd.nextInt(100)+1;
			gradeScoreVO[i].intMath=rnd.nextInt(100)+1;
			gradeScoreVO[i].strStudentNum=String.format("%03d", i+1);
			gradeScoreVO[i].total();
			gradeScoreVO[i].average();
		}
	}
	public void scoreList() {
		System.out.println("------------------------------");
		System.out.println("성적 일람표");
		System.out.println("------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------");
		for(int i=0;i<gradeScoreVO.length; i++) {
			System.out.print(gradeScoreVO[i].strStudentNum+"\t");
			System.out.printf("%3d\t",gradeScoreVO[i].intKor);
			System.out.printf("%3d\t",gradeScoreVO[i].intEng);
			System.out.printf("%3d\t",gradeScoreVO[i].intMath);
			System.out.printf("%3d\t",gradeScoreVO[i].intSumScore);
			System.out.printf("%5.2f\n",gradeScoreVO[i].dAvg);
		}
		System.out.println("-----------------------------");
	}
}
