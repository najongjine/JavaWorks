package com.biz.thread.exec;

import com.biz.thread.classes.StaticClassV1;

public class StaticEx01 {

	public static void main(String[] args) {
		StaticClassThread01 sc=new StaticClassThread01();
		sc.start();
		
		StaticClassV1.sum=0;
		for(int i=1;i<=100;i++) {
			StaticClassV1.sum+=i;
		}
		System.out.println("Main에서 계산한 합계");
		System.out.println(StaticClassV1.sum);
	}
}
