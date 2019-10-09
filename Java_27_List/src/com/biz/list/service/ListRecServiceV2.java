package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListRecServiceV2 {
	private String name;
	private List<String> myStrList;
	private List<String> recStrList;
	
	public ListRecServiceV2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListRecServiceV2(List<String> recStrList, String name) {
		super();
		// TODO Auto-generated constructor stub
		myStrList=new ArrayList<String>();
		this.recStrList=recStrList;
		this.name=name;
	}
	public void remove() {
		myStrList.add(recStrList.get(0));
		this.recStrList.remove(0);
	}
	public void viewList() {
		
		System.out.println("======================================");
		System.out.println(this.name);
		System.out.println("--------------------------------------");
		System.out.println(recStrList.toString());
		System.out.println(myStrList.toString());
		/*
		for(String str:this.recStrList) {
			System.out.println(str);
		}*/
	}
	
}
