package com.biz.iolist.exec;

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rnd1=Math.random();
		
		int start=10;
		int end=55;
		for(int i=0;i<10;i++) {
			double rnd=Math.random();
			int num=(int)(rnd1*(end-start +1) +start);
			System.out.println(num);
		}
	}

}
