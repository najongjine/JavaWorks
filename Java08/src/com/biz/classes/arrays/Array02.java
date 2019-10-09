package com.biz.classes.arrays;

import java.util.Random;

public class Array02 {
	public static void main(String[] args) {
		int[] nums=new int[10];
		Random rnd=new Random();
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=rnd.nextInt(10)+1;
		}
		
		int sNum=rnd.nextInt(10)+1;
		int index=0;
		for(index=0; index<nums.length;index++) {
			if(nums[index]==sNum)break;
		}
		if(index>=nums.length) System.out.printf("배열에 %d 값 없음\n", sNum);
		else {
			System.out.printf("배열 %d번째에 %d값 있음\n",index,sNum);
			System.out.printf("nums[%d]=%d \n",index,nums[index]);
		}
		
	}
}
