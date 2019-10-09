package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List02 {

	public static void main(String[] args) {
		//정수값을 담을 nums list를 선언과 생성
		List<Integer> nums=new ArrayList<Integer>();
		List<String> strs=new ArrayList<String>();
		List<Long> longs=new ArrayList<Long>();
		List<Double> doubles=new ArrayList<Double>();
		List<Character> chars=new ArrayList<Character>();
		
		Random rnd=new Random();
		for(int i=0;i<5;i++) {
			nums.add(rnd.nextInt(100)-10);
		}
		int numsSize=nums.size();//최적화
		
		/* 확장 for. forEach
		 * nums 개수만큼 반복문을 샐행하면서
		 * nums의 요소를 getter하여 n변수에 담아준다
		 * nums가 collection일때 사용가능. 전체 읽기전용
		 */
		for(int n:nums) {
			// int n=nums.get(i) 이 생략됨
			System.out.println(n);
		}
		
		for(int n:nums) {
			int index;
			for(index=2;index<n;index++) {
				if(n%index==0) break;
			}
			if(index >=n) System.out.printf("%d 은 소수이다\n",n);
		}//find prime num
	}//main end

}
