package com.biz.classes;

import com.biz.classes.model.GradeScoreVO;

public class GSEX01 {

	public static void main(String[] args) {
		GradeScoreVO[] gsVO=new GradeScoreVO[10];
		for(int i=0; i<gsVO.length;i++) {
			gsVO[i]=new GradeScoreVO();
		}
		
		gsVO[0].strStudentNum="001";
		gsVO[0].intEng=99;
		gsVO[0].intKor=99;
		gsVO[0].intMath=11;

		gsVO[1].strStudentNum="002";
		gsVO[1].intEng=89;
		gsVO[1].intKor=99;
		gsVO[1].intMath=21;
		
		gsVO[2].strStudentNum="003";
		gsVO[2].intEng=99;
		gsVO[2].intKor=99;
		gsVO[2].intMath=31;
		
		for(int i=0; i<gsVO.length; i++) {
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
