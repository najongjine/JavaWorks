package com.biz.list.array;

import java.util.Random;

public class Prime01 {

	public static void main(String[] args) {
		int[] nums=new int[50];
		Random rnd=new Random();
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=rnd.nextInt(100)+1;
		}//init
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
			if((i+1)%5==0) {
				System.out.println();
			}
			else {
				System.out.print(", ");
			}
		}//view

		for(int i=0;i<nums.length;i++) {
			if(nums[i]<2) {
				continue;
			}
			for(int j=2, index2=2;j<=nums[i]-1;j++) {
				if(nums[i]%j!=0) {
					index2++;
				}
				if(nums[i]<=index2) {
					System.out.printf("%d번째는 소수입니다: %d\n",i,nums[i]);
					break;
				}
			}
		}
		
	}//main end

}
