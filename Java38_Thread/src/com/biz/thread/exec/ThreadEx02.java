package com.biz.thread.exec;

import java.util.Scanner;

import com.biz.thread.classes.Run01;
import com.biz.thread.classes.Run02;

public class ThreadEx02 {

	public static void main(String[] args) {
		Runnable r1=new Run01();
		Thread t1=new Thread(r1);
		Runnable r2=new Run02();
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("문자열을 입력하세요 >> ");
		String str=scanner.nextLine();

	}

}
