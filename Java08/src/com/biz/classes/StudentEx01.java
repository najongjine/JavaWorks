package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class StudentEx01 {

	public static void main(String[] args) {
		StudentVO[] stVO=new StudentVO[5];
		
		for(int i=0; i<stVO.length; i++) {
			stVO[i]=new StudentVO();
		}
		
		stVO[0].strNum="001";
		stVO[0].strName="aaa";
		stVO[0].strTel="000-111-2222";
		
		stVO[1].strNum="002";
		stVO[1].strName="bbb";
		stVO[1].strTel="000-111-2223";
		
		stVO[2].strNum="003";
		stVO[2].strName="ccc";
		stVO[2].strTel="000-111-2224";
		
		System.out.println("----------------------------");
		System.out.println("학생명부");
		System.out.println("-----------------------------");
		System.out.println("학번\t이름\t전화번호");
		System.out.println("-------------------------------");
		for(int i=0; i<stVO.length;i++) {
			System.out.print(stVO[i].strNum+"\t");
			System.out.print(stVO[i].strName+"\t");
			System.out.print(stVO[i].strTel+"\n");
		}
		System.out.println("-------------------------------");
	}

}
