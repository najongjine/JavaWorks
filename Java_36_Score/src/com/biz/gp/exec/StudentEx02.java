package com.biz.gp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.gp.domain.StudentVO;

public class StudentEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentVO> stdList=new ArrayList<StudentVO>();
		List<StudentVO> stdList2=new ArrayList<StudentVO>();
		
		 long start1=System.currentTimeMillis();
		for(long i=0; i<10000000;i++) {
			StudentVO stdVO=new StudentVO();
			stdVO.setSt_num(String.format("%05d", i));
			stdList.add(stdVO);
		}
		 long end1=System.currentTimeMillis();
		 System.out.println(end1-start1);
		
		 long start2=System.currentTimeMillis();
		for(long i=0; i<10000000;i++) {
			//StudentVO stdVO=new StudentVO();
			stdList2.add(new StudentVO(String.format("%05d", i),"","","",0,""));
		}
		long end2=System.currentTimeMillis();
		System.out.println(end2-start2);
	}

}
