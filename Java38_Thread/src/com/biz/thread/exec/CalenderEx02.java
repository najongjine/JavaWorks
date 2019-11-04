package com.biz.thread.exec;

import com.biz.thread.classes.CalS01;
import com.biz.thread.classes.CalS02;

public class CalenderEx02 {
	public static void main(String[] args) {
		
		CalS01 ca1=new CalS01();
		ca1.start();
		
		CalS02 ca2=new CalS02();
		ca2.start();
	}
	
	
}
