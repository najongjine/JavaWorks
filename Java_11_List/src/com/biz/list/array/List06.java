package com.biz.list.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * List interface의 활용 
 * ArrayList, LinkedList는 list interface를 설계도로하여 작성 되었고,
 */
public class List06 {
	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<Integer>();
		nums=new LinkedList<Integer>();
		
		nums.add(4);
		nums.add(4);
		nums.add(4);
		
		int total= nums.get(0)+nums.get(1)+nums.get(2);
	}
}
