package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.ScoreVO;

public class ScoreEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ScoreVO> scoreList=new ArrayList<ScoreVO>();
		
		scoreList.add(new ScoreVO.Builder().s_num("001").build());

	}

}
