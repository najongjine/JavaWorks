package com.biz.thread.classes;

/*
 * thread 클래스를 직접 상속받아서 사용하면
 * 다른 클래스를 상속받을수 없다.
 * 그래서 인터페이스를 implement 함.
 */
public class Run01 implements Runnable{

	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<=Integer.MAX_VALUE-10;i++) {
			sum+=i;
		}
		System.out.printf("\n %d~%d 덧셈수행결과: %d \n",1,Integer.MAX_VALUE-10,sum);
	}
}
