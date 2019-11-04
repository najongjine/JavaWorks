package com.biz.thread.exec;

import com.biz.thread.classes.SingleClassV1;

public class SingleEx01 {

	public static void main(String[] args) {
		SingleClassThreadEx01 sct=new SingleClassThreadEx01();
		sct.start();
		SingleClassV1 sc=SingleClassV1.getInstance();
		
		sc.sum=0;
		for(int i=1;i<=100;i++) {
			sc.sum+=i;
		}
		System.out.println("main에서 계산한 결과: "+sc.sum);
	}

}
