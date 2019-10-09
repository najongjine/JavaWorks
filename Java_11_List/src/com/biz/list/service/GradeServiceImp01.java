package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.GradeVO;

public class GradeServiceImp01 implements GradeService {
	private List<GradeVO> gradeList;
	GradeVO gVO;
	Random rnd;
	
	public GradeServiceImp01() {
		gradeList=new ArrayList<GradeVO>();
		gVO=new GradeVO();
		rnd=new Random();
		System.out.println("gradeList hash: "+gradeList.hashCode());
	}// init
	public void input(int size) {
		for(int i=0; i<size; i++) {
			String strNum=String.format("%05d", i+1);
			int intKor=rnd.nextInt(50)+51;
			int intEng=rnd.nextInt(50)+51;
			int intMath=rnd.nextInt(50)+51;
			
			gVO=new GradeVO();
			gVO.strNum=strNum;
			gVO.intEng=intEng;
			gVO.intKor=intKor;
			gVO.intMath=intMath;
			System.out.printf("gVO hash: %d\n",gVO.hashCode());
			
			gradeList.add(gVO);
			System.out.printf("%d 번 gradeList hash: %d\n",i,gradeList.get(i).hashCode());
		}

	}//input end
	public void view() {
		System.out.println("-------------------------------------------");
		System.out.println("성적일람표");
		System.out.println("--------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("----------------------------------------------");
		for(GradeVO vo:gradeList) {
			System.out.printf("%5s\t",vo.strNum);
			System.out.printf("%3d\t",vo.intKor);
			System.out.printf("%3d\t",vo.intEng);
			System.out.printf("%3d\t",vo.intMath);
			System.out.printf("%3d\t",vo.intTotal);
			System.out.printf("%3d\t",vo.intAvg);
			System.out.printf("%3d\n",vo.intRank);
		}
		System.out.println("--------------------------------------------------");
	}//view end
	public void total() {
		int intSize=gradeList.size();
		for(int i=0;i<intSize;i++) {
			/*
			 *gradeList의 i번째 저장되어있는 gVO의 intKor값을 읽어서 total 변수에 복사하라.
			 */
			int total=gradeList.get(i).intEng+gradeList.get(i).intKor+gradeList.get(i).intMath;
			/*
			 * gradeList i번째에 저장되어있는 gVO intTotal 맴버변수에 total 변수의 저장된 값을
			 * 복사하라
			 */
			gradeList.get(i).intTotal=total;//gradeList.get(i) 자체가 포인터. 가르키는곳
			gradeList.get(i).intAvg=total/3;
		}
	}
}
