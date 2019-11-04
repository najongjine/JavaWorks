package com.biz.thread.classes;

/*
 * 일반적인 SingleTon클래스: single thread 화경에서는 메모리 절약을 수행하는 목적에 맞다.
 * 하지만 multi thread 환경에서는 동기화 문제를 일으키고 
 * 때로는 singlkeTon이 아닌 다수의 객체인스턴스가 생성될수 있다
 * ->동기화를 억지로 수행할 경우
 */
public class SingleClassV1 {
	private static SingleClassV1 singleClassV1;
	public static int sum;
	
	static {
		if(singleClassV1==null) {
			singleClassV1=new SingleClassV1();
		}
	}
	public static SingleClassV1 getInstance() {
		return singleClassV1;
	}
}
