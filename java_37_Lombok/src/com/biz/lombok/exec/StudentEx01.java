package com.biz.lombok.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentVO> stdList=new ArrayList<StudentVO>();
		StudentVO sVO=new StudentVO();
		sVO.setS_num("001");
		sVO.setS_name("aaa");
		stdList.add(sVO);
		
		stdList.add(StudentVO.builder().s_num("002").s_name("bbb").s_addr("aaa111").s_dept("001")
				.s_grade(1).s_tel("11111111111").build());
		
		for(StudentVO _sVO:stdList) {
			System.out.println(_sVO.toString());
		}
		
	}

}
