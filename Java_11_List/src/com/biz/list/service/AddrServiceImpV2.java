package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrServiceImpV2 implements AddrService {
	private List<AddrVO> addrList;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		addrList=new ArrayList<AddrVO>();
		AddrVO aVO=new AddrVO();
		AddrVO aVO2=aVO;
		
		aVO.setStrAddr("11aaa11 adw2");
		aVO.setStrEmail("gdgesg@ggg.vom");
		aVO.setStrName("aaa");
		aVO.setStrTel("111-1111-1111");
		
		addrList.add(aVO);
		
		aVO=new AddrVO();
		aVO.setStrAddr("22aaa11 adw2");
		aVO.setStrEmail("g111sg@bbbb.vom");
		aVO.setStrName("bbb");
		aVO.setStrTel("222-2222-2222");
		addrList.add(aVO);
		
		//aVO=new AddrVO();
		aVO.setStrAddr("33aaa11 adw333");
		aVO.setStrEmail("g222sg@ccc.vom");
		aVO.setStrName("ccc");
		aVO.setStrTel("333-3333-3333");
		addrList.add(aVO);

	}

	@Override
	public void list() {

		System.out.println("--------------------------------");
		System.out.println("주소록");
		System.out.println("---------------------------------");
		System.out.println("이름\t전화\t\t주소\t\t이메일");
		System.out.println("----------------------------------");
		int nSize=addrList.size();
		for(int i=0; i<nSize; i++) {
			System.out.printf("%s\t%10s\t%10s\t%10s\n",addrList.get(i).getStrName(),addrList.get(i).getStrTel(),
					addrList.get(i).getStrAddr(),addrList.get(i).getStrEmail());
		}
		System.out.println("---------------------------------------");

	}

	@Override
	public void view(int num) {
		
		if(num>addrList.size()-1) {
			System.out.println("데이터가 없음");
			return;
		}
		AddrVO aVO=addrList.get(num);
		System.out.println("이름: "+aVO.getStrName());
		System.out.println("전화: "+aVO.getStrTel());
		System.out.println("이메일: "+aVO.getStrEmail());
		System.out.println("주소: "+aVO.getStrAddr());

	}

}
