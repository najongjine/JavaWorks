package com.biz.classes.exec;

import com.biz.classes.service.ClassServiceV1;

public class ClassEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassServiceV1 cs=new ClassServiceV1();
		
		String strName="홍길동";
		cs.getName(strName);
		System.out.println(strName);
		
		String[] strNames=new String[2];
		strNames[0]="이몽룡";
		strNames[1]="성춘향";
		cs.getName(strNames);
		System.out.println(strNames[0]+"\t"+strNames[1]);
	}

}
