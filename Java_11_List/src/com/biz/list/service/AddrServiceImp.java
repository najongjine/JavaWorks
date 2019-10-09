package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrServiceImp implements AddrService {
	private List<AddrVO> addrList;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		addrList=new ArrayList<AddrVO>();
		AddrVO aVO=new AddrVO();
		
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
		for(AddrVO vo:addrList) {
			System.out.printf("%s\t",vo.getStrName());
			System.out.printf("%s\t",vo.getStrTel());
			System.out.printf("%s\t",vo.getStrAddr());
			System.out.printf("%s\n",vo.getStrEmail());
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
