package com.biz.thread.classes;

/*
 * thread 클래스를 직접 상속받아서 사용하면
 * 다른 클래스를 상속받을수 없다.
 * 그래서 인터페이스를 implement 함.
 */
public class Run02 implements Runnable{

	@Override
	public void run() {
		long start=1;
		long end=100000L;
		String sum="";
		for(long i=start;i<=end;i++) {
			sum+=(int)(Math.random()*100)+"\n";
		}
		System.out.printf("\n %d~%d 덧셈수행결과: %s \n",start,end,sum);
	}
}
