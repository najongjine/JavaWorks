package com.biz.method.service;

import java.util.List;

public class ViewListService {
	public void setListAll() {
		
	}
	public int setListAllAndView(List<Integer> intList) {
		int nSize=intList.size();
		for(int num:intList) {
			System.out.println(num);
		}
		return nSize;
	}
}
