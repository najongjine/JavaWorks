package com.biz.classes.arrays;

import com.biz.classes.model.StudentVO;

public class Array01 {
	public static void main(String[] args) {
		StudentVO[] stVO=new StudentVO[10];//java jdk에 없음
		//User Define Class|User Define Type
		/*
		 * stVO[i]: stVO배열의 i번 위치에 있는 요소에 접근하겠다
		 */
		for(int i=0; i<10; i++) {
			stVO[i]=new StudentVO();//[0]:= array index|배열첨자
		}
		
		String[] strString=new String[10];
		strString[0]="00000";
		strString[1]="111111";
		strString[2]="222222222";
		
		
		System.out.println(strString[9]);
	}
}
