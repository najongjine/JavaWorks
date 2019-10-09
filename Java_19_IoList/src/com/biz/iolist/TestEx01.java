package com.biz.iolist;

import com.biz.iolist.service.IoListService;
import com.biz.iolist.service.IoListServiceImpV3;

public class TestEx01 {

	public static void main(String[] args) {
		String fileName="src/com/biz/iolist/매입매출정보.txt";
		IoListService ioService=new IoListServiceImpV3();
		try {
			ioService.read(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ioService.list();
	}

}
