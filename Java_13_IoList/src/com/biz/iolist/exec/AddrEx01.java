package com.biz.iolist.exec;

import com.biz.iolist.model.AddrVO;

public class AddrEx01 {

	public static void main(String[] args) {
		AddrVO addrVO=new AddrVO(1);
		String str=addrVO.toString();
		System.out.println(AddrVO.class.toString());
		System.out.println(str);
	}

}
