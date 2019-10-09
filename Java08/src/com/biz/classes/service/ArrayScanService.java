package com.biz.classes.service;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {
	private int[] nums;
	
	//생성자:= new ArrayScanService()생성자 매서드를
	//호출할때 자동으로 호출되는 method
	public ArrayScanService(int length) {
		Random rnd=new Random();
		nums=new int[length];
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=rnd.nextInt(10)+1;
		}
	}
	public void scanArray() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("1~10 까지 정수중 한개 입력 > ");
		String strNum=scanner.nextLine();
		int sNum=Integer.valueOf(strNum);
		
		int index;
		for(index=0; index<nums.length;index++) {
			if(nums[index]==sNum) {
				break;
			}
		}
		if(index>=nums.length) {
			System.out.printf("배열에 %d 값 있지 않음\n", sNum);
		}
		else {
			System.out.printf("배열 %d번째에 %d값 있음\n",index,sNum);
			System.out.printf("nums[%d]=%d \n",index,nums[index]);
		}
		scanner.close();
	}
	public void scanArrayAll() {
		Scanner scanner=new Scanner(System.in);
		Random rnd=new Random();
		
		System.out.print("1~10 까지 정수중 한개 입력 > ");
		String strNum=scanner.nextLine();
		int sNum=Integer.valueOf(strNum);
		
		int nCount=0;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]==sNum) {
				System.out.printf("배열 %d번째에 %d값 있음\n",i,sNum);
				nCount++;
				
			}
		}
		for(int i=0; i<nums.length; i++) {
			nums[i]=rnd.nextInt(10)+1;
		}
		if(nCount<1) {
			System.out.printf("배열에 %d 값 있지 않음\n", sNum);
			for(int i=0; i<nums.length; i++) {
				nums[i]=rnd.nextInt(10)+1;
		}

		}
		
		//scanner.close();
	}
}
