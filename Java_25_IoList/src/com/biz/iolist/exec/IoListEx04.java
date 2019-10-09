package com.biz.iolist.exec;

import com.biz.iolist.service.IoListService;

public class IoListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strProFileName="src/com/biz/iolist/과자이름.txt";
		String strProWriteFile="src/com/biz/iolist/상품정보.txt";
		IoListService is=new IoListService();
		
		try {
			is.readProduct(strProWriteFile);
			is.buyMake();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
