package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.string.domain.StudentVO;

public class StudentServiceV1  extends ScoreServiceV1 implements StringService {
	protected List<StudentVO> stdList;
	Random rnd;
	
	public StudentServiceV1(List<StudentVO> stdList) {
		super();
		this.stdList = stdList;
	}

	public StudentServiceV1() {
		super();
		stdList=new ArrayList<StudentVO>();
		rnd=new Random();
	}
	

	public List<StudentVO> getStdList() {
		return stdList;
	}

	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}

	@Override
	public void input() {
		super.input();
		String[] students=new String[] {
				"홍길동:서울특별시:010-111-2452",
				"서운향:남원시:234-211-2234",
				"이몽룡:구리시:010-231-4453"
		};
		for(int i=0;i<students.length;i++) {
			String[] _str=students[i].split(":");
			for(int j=0;j<students.length;j++) {
			}
		}
		String[] stdArray;
		int intNum=1;
		for(String s:students) {
			StudentVO vo=new StudentVO();
			vo.setStrNum(String.format("%05d", intNum++));
			vo.setIntAge(rnd.nextInt(60)+21);
			stdArray=s.split(":");
			for(int i=0; i<stdArray.length;) {
				vo.setStrName(stdArray[i++]);
				vo.setStrAddr(stdArray[i++]);
				vo.setStrTel(stdArray[i++]);
			}
			stdList.add(vo);
		}
	}

	@Override
	public void list() {
		System.out.println("======================================");
		System.out.println("학생명부");
		System.out.println("=====================================");
		System.out.println("학번\t이름\t나이\t주소\t전화번호");
		for(StudentVO vo:stdList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getIntAge()+"\t");
			System.out.print(vo.getStrAddr()+"\t");
			System.out.print(vo.getStrTel()+"\n");
		}
		System.out.println("=========================================");
	}

	@Override
	public StudentVO view(String strNum) {
		for(StudentVO vo:stdList) {
			if(strNum.equalsIgnoreCase(vo.getStrNum())) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

}
