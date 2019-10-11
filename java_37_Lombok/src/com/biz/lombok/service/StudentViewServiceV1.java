package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {
	
	public void view() {
		for(StudentVO stdVO:stdList) {
			System.out.println(stdVO.toString());
		}
	}
	public void view(String strName) {
		int count=0;
		for(StudentVO stdVO:stdList) {
			if(stdVO.getS_name().equalsIgnoreCase(strName)) {
				System.out.println(stdVO.toString());
				count++;
			}
		}
		if(count<1) System.out.println("해당하는 이름 없음!!");
	}
	public void view(int intGrade) {
		int count=0;
		for(StudentVO stdVO:stdList) {
			if(stdVO.getS_grade()==intGrade) {
				System.out.println(stdVO.toString());
				count++;
			}
		}
		if(count<1) System.out.println("해당하는 학년 없음!!");
	}

	@Override
	public void view(int grGrade, int lessGrade) {
		int count=0;
		for(StudentVO stdVO:stdList) {
			if(stdVO.getS_grade()<=lessGrade && stdVO.getS_grade()>=grGrade) {
				System.out.println(stdVO.toString());
				count++;
			}
		}
		if(count<1) System.out.println("해당하는 성적범위 없음!");
	}

}
