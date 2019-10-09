package com.biz.collections.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		Set<Integer> intSet=new TreeSet<Integer>();
		Random rnd=new Random();
		
		for(int i=0;i<10;i++) {
			intSet.add(rnd.nextInt(1000));
		}
		System.out.println(intSet);
		
		Set<String> strSet=new TreeSet<String>();
		for(int i=0;i<10;i++) {
			strSet.add(String.format("%05d",rnd.nextInt(100)));
		}
		System.out.println(strSet);
	}

}
