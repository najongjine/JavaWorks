package com.biz.classes.exec;

public class ClassEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=30;
		int num2=40;
		
		int[] nums=new int[2];
		nums[0]=33;
		nums[1]=44;
		swap(nums);
		System.out.println(nums[0]+"\t"+nums[1]);
	}
	public static int[] swap(int num1, int num2) {
		int _num1=num1;
		num1=num2;
		num2=_num1;
		int[] nums=new int[2];
		nums[0]=num1;
		nums[1]=num2;
		return nums;
	}
	public static void swap(int[] nums) {
		int _num1=nums[0];
		nums[0]=nums[1];
		nums[1]=_num1;
	}
}
