package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.ScoreVO;

public class ScoreEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ScoreVO> scoreList=new ArrayList<ScoreVO>();
		ScoreVO scoreVO=new ScoreVO();
		
		/*
		 * Build 패턴으로 객체를 생성
		 * 객체를 생성하면서 필드값을 주입하는 생성자의 기능+
		 * 필드 이름과 같은 setter method를 통ㅇ해서 갑을 주입하는 기능.
		 * 
		 * 객체를 생성해서 setter method를 이용하는 beans 패턴은 느려서
		 * 이 방법을 사용함.
		 */
		ScoreVO scoreBVO=new ScoreVO.Builder().s_num("001")
				.s_eng(89)
				.s_kor(89)
				.s_math(67).build();
		scoreList.add(scoreBVO);
		
		scoreBVO=new ScoreVO.Builder().s_num("002")
				.s_eng(89)
				.s_kor(89)
				.s_math(77).build();
		scoreList.add(scoreBVO);
		
		scoreList.add(new ScoreVO.Builder().s_num("003")
				.s_eng(89)
				.s_kor(89)
				.s_math(77).build());
		scoreList.add(new ScoreVO.Builder().s_num("003")
				.s_eng(89)
				.s_kor(89)
				.build());
	}

}
