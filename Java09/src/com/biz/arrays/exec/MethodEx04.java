package com.biz.arrays.exec;

import com.biz.array.service.MethodService;

public class MethodEx04 {
	public static void main(String[] args) {
		MethodService ms=new MethodService();
		
		int retNum=ms.getSum(30,40);
		System.out.println("retNum 값: "+retNum);
	}
}
