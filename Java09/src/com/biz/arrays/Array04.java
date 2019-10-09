package com.biz.arrays;

import java.util.Random;

/*배열 요소의 정렬
 * Algorithm
 * */
 
public class Array04 {
	public static void main(String[] args) {
		int[] nums=new int[100];
		Random rnd=new Random();
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=rnd.nextInt(99999)+1;
			
		}
		for(int i=0; i<nums.length;i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					int _temp=nums[j];
					nums[j]=nums[i];
					nums[i]=_temp;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
			if((i+1)%5==0) {
				System.out.println();
			}
			else {
				System.out.print(", ");
			}
		}
	}
}
