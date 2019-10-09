package com.biz.array.exec.score;

import java.util.Random;

import com.biz.array.model.ScoreVO;

public class ScoreEx01 {

	public static void main(String[] args) {
		ScoreVO[] sVO=new ScoreVO[20];
		Random rnd=new Random();
		
		for(int i=0;i<sVO.length;i++) {
			sVO[i]=new ScoreVO();
			sVO[i].strNum=String.format("%03d", i+1);
			sVO[i].intEng=rnd.nextInt(100)+1;
			sVO[i].intMath=rnd.nextInt(100)+1;
			sVO[i].intKor=rnd.nextInt(100)+1;
			sVO[i].total();
			sVO[i].avg();
			sVO[i].view();
		}
	}

}
