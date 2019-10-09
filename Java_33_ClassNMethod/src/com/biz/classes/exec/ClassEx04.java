package com.biz.classes.exec;

public class ClassEx04 {
/*
 * 배열,객체,list 는 call by ref, 단! new로 재 생성을 하면 
 * 원본과는 다른 변수가 되어 값을 변경을해도 원본에 영향을 미치지 않는다. call by value로 바뀜.
 * premitive는 call by value
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[2];
		nums[0]=33;
		nums[1]=44;
		swap(nums);
		System.out.println(nums[0]+"\t"+nums[1]);
	}
	public static void swap(int[] nums) {
		nums=new int[2];
		nums[1]=100;
		nums[0]=200;
	}
}
