package com.biz.classes;

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

public class GSEX02 {

	public static void main(String[] args) {
		GradeScoreVO[] gsVO=new GradeScoreVO[10];
		Random rnd=new Random();
		
		for(int i=0; i<gsVO.length; i++) {
			gsVO[i]=new GradeScoreVO();
			gsVO[i].intEng=rnd.nextInt(100)+1;
			gsVO[i].intKor=rnd.nextInt(100)+1;
			gsVO[i].intMath=rnd.nextInt(100)+1;
			gsVO[i].strStudentNum=String.format("%03d", i+1);
			gsVO[i].total();
			gsVO[i].average();
		}
		System.out.println("------------------------------");
		System.out.println("성적 일람표");
		System.out.println("------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------");
		for(int i=0;i<gsVO.length; i++) {
			System.out.print(gsVO[i].strStudentNum+"\t");
			System.out.printf("%3d\t",gsVO[i].intKor);
			System.out.printf("%3d\t",gsVO[i].intEng);
			System.out.printf("%3d\t",gsVO[i].intMath);
			System.out.printf("%3d\t",gsVO[i].intSumScore);
			System.out.printf("%5.2f\n",gsVO[i].dAvg);
		}
		System.out.println("-----------------------------");
	}

}
