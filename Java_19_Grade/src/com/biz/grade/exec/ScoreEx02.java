package com.biz.grade.exec;

import com.biz.grade.domain.ScoreVO;

public class ScoreEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreVO[] scoreVO=new ScoreVO[5];
		
		scoreVO[1]=new ScoreVO();
		scoreVO[1].setEngScore(90);
		scoreVO[1].setKorScore(90);
		scoreVO[1].setMathScore(90);
		
		int intSum=scoreVO[1].getEngScore()+scoreVO[1].getKorScore()+scoreVO[1].getMathScore();
	}

}
