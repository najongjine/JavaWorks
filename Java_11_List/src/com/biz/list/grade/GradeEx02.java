package com.biz.list.grade;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.service.GradeService;
import com.biz.list.service.GradeServiceImp02;

public class GradeEx02 {

	public static void main(String[] args) {
		//GradeService interface로 gs 객체를 정의하고
		//GradeServiceImp01()을 이용해서 gs객체를 생성
		//GradeService gs=new GradeServiceImp01();
		GradeService gs=new GradeServiceImp02();
		
		//List interface로 nums객체를 정의
		// ArrayList()를 이용해서 nums 객체를 생성
		List<Integer> nums=new ArrayList<Integer>();
	}

}
