package com.biz.iolist.exec;

import com.biz.iolist.model.GradeVO;

public class GradeEx01 {

	public static void main(String[] args) {
		GradeVO gradeVO=new GradeVO();
		
		gradeVO.setIntKor(88);
		gradeVO.setStrName("aaa");
		gradeVO.setStrNum("01");
		System.out.println(gradeVO.toString());
	}

}
