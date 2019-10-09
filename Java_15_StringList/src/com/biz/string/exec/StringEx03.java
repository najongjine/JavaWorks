package com.biz.string.exec;

import java.util.Random;

public class StringEx03 {

	public static void main(String[] args) {
		Random rnd=new Random();
		int num=0;
		int sum=0;
		
		for(int i=0;i<10;i++) {
			num=rnd.nextInt();
			if(num<0) {
				num*= -1;
			}
			System.out.println(num);
			String strNum=num+"";
			String strNum2=String.valueOf(strNum.charAt(3));
			//System.out.println(Integer.valueOf(strNum2));
			sum+=Integer.valueOf(strNum2);
		}
		System.out.println(sum);
	}
}
