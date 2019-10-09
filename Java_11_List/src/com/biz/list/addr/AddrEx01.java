package com.biz.list.addr;

import com.biz.list.service.GradeService;
import com.biz.list.service.GradeServiceImp01;

public class AddrEx01 {

	public static void main(String[] args) {
		GradeService gs=new GradeServiceImp01();
		GradeService gs2=gs;
		
		System.out.println(gs.hashCode());
		System.out.println(gs2.hashCode());
		gs.input(3);
		gs2.input(1);
		gs.view();
		gs2.view();
	}
	
}
