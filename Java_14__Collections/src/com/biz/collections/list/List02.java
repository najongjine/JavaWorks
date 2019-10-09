package com.biz.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02 {
	public static void main(String[] args) {
	List<String> strList=new ArrayList<String>();
	
	strList.add("aaa");
	strList.add("aaa");
	strList.add("ccc");
	strList.add("bbb");
	
	Collections.sort(strList);
	Collections.shuffle(strList);
	System.out.println(strList);
	}
}
