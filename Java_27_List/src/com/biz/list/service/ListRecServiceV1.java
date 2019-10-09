package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListRecServiceV1 {
	private List<String> myStrList;
	private List<String> recStrList;
	
	public ListRecServiceV1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListRecServiceV1(List<String> recStrList) {
		super();
		// TODO Auto-generated constructor stub
		myStrList=new ArrayList<String>();
		this.recStrList=recStrList;
	}
	public void setStrList(List<String> recStrList) {
		this.recStrList=recStrList;
	}
	public void viewList() {
		for(String str:this.recStrList) {
			System.out.println(str);
		}
	}
	
}
