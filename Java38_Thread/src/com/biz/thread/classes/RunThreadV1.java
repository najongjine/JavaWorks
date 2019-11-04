package com.biz.thread.classes;

/*
 * main method의 흐름과 별도로 background에서 작동 하도록 구성할 class
 * 
 * 1.bakcground에서 별도ㅛ의 thread도 작동하기 위해서
 * Thread클래스를 삭송 받아서 클래스를 작성한다.
 */
public class RunThreadV1 extends Thread{

	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<=Integer.MAX_VALUE-10;i++) {
			sum+=i;
		}
		System.out.println("덧셈수행결과: "+sum);
	}

}
