package com.biz.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
		//저장된 순서와 무관하게 저장하며, 중복배제로 저장한다
		Set<String> strSet=new HashSet<String>();
		
		//중복배제+오름차순 정렬 저장
		Set<String> strSet1=new TreeSet<String>();
		
		strSet.add("aaa");
		strSet.add("bbb");
		strSet.add("ccc");
		strSet.add("ddd");
		strSet.add("ccc");
		strSet.add("ddd");
		
		strSet1.add("aaa");
		strSet1.add("bbb");
		strSet1.add("ccc");
		strSet1.add("ddd");
		strSet1.add("ccc");
		strSet1.add("ddd");
		
		System.out.println(strSet);
		System.out.println(strSet1);
		
		
	}

}
