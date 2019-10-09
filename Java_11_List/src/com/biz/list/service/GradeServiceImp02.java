package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.GradeVO;

/*
 * GradeServiceImp*를 만들때 반드시 GradeService interface를 implements 해서 사용하는 
 * 프로젝트 규칙이 있다.
 * 그래서 GradeService interface를 implements 했더니
 * 클래스 정의에서 오류가 발생 하더라
 * 
 * 오류 발생을 fix했더니 GradeService interface에서 정의한 method들이 자동생성 되었다.
 * 결론적으로 GradeService는 여러 클래스를 작성하는 매우 엄격한 
 * 규칙을 가진 설계도 역활을 수행하는 것이다.
 */
public class GradeServiceImp02 implements GradeService{
	GradeVO gVO;
	List<GradeVO> gVOList;
	
	public GradeServiceImp02() {
		gVOList=new ArrayList<GradeVO>();
		gVO=new GradeVO();

	}

	@Override
	public void input(int size) {
		// TODO Auto-generated method stub
		gVOList.add(gVO);
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		
	}

}
