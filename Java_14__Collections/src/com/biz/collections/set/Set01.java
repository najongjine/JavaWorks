package com.biz.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<String>();
		Set<String> strSet=new HashSet<String>();
		
		//List는 추가한 순서대로 저장된다
		strList.add("aaa");
		strList.add("bbb");
		strList.add("ccc");
		strList.add("ddd");
		strList.add("ccc");
		strList.add("ddd");
		
		//Set은 지 맘대로 저장, 중복 제거
		strSet.add("aaa");
		strSet.add("bbb");
		strSet.add("ccc");
		strSet.add("ddd");
		strSet.add("ccc");
		strSet.add("ddd");
		
		
		System.out.println(strList.toString());
		System.out.println(strSet.toString());
		
		//List형 데이터를 Set형 데이터로 변환
		//List에 담긴 데이터에서 중복값을 제외하고
		//리스트를 얻기위한 방법
		Set<String> strSet1=new HashSet<String>(strList);
		System.out.println(strSet1);
	}

}
