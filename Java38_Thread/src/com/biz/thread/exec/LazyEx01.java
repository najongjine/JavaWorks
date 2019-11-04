package com.biz.thread.exec;

public class LazyEx01 {
	
	public static void main(String[] args) {
		LazyThreadEx01 lt=new LazyThreadEx01();
		lt.start();
		LazyClassV1 lc=LazyClassV1.getInstance();
		lc.sum=0;
		for(int i=0;i<=100;i++) {
			lc.sum+=i;
		}
		System.out.println("main: "+lc.sum);
	}

}
