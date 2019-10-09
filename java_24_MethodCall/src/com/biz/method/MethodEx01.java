package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;
import com.biz.method.service.ViewListService;

public class MethodEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeListService ms=new MakeListService();
		
		List<Integer> intList=ms.getListAll();
		ViewListService vs=new ViewListService();
		int aa=vs.setListAllAndView(intList);
		System.out.println(aa);
	}

}
