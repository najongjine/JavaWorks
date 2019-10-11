package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.StudentVO;

public class StudentEx01 {
	public static void main(String[] args) {
		List<StudentVO> stdVOList=new ArrayList<StudentVO>();
		StudentVO stdVO=new StudentVO();
		//Java Beans Pattern(classic coding)
		stdVO.setSt_num("001");
		stdVO.setSt_name("aaa");
		stdVO.setSt_addr("aaaaa11111");
		stdVO.setSt_dept("001");
		stdVO.setSt_tel("1111111111");
		stdVO.setSt_grade(1);
		stdVOList.add(stdVO);
		
		stdVO=new StudentVO("002", "bbb", "2222222222", "bbbb22222", 3, "005");
		stdVOList.add(stdVO);
		stdVOList.add(new StudentVO("003", "ccc", "33333333333", "ccc333", 2, "004"));
	}
	
}
