package com.biz.thread.exec;

import com.biz.thread.classes.Cal01;
import com.biz.thread.classes.Cal02;

public class CalenderEx01 {
	public static void main(String[] args) {
		
		Cal01 ca1=new Cal01();
		ca1.start();
		
		Cal02 ca2=new Cal02();
		ca2.start();
	}
	
	
}
