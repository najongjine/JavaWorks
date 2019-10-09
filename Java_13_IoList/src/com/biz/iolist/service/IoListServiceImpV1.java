package com.biz.iolist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.iolist.model.IoListVO;
import com.biz.iolist.model.IoListVO;

public class IoListServiceImpV1 implements IoListService {
	//상속으로 넘겨줄땐 protected.
	protected List<IoListVO> ioList;
	
	public IoListServiceImpV1() {
		ioList=new ArrayList<IoListVO>();
	}//init end
	@Override
	public void input() {
		IoListVO ioListVO=new IoListVO();
		Random rnd=new Random();
		int intH=rnd.nextInt(5)+1;
		String strProductName=String.format("청정미 %d호", intH);
		int intHour=rnd.nextInt(24);
		int intMinute=rnd.nextInt(60);
		int intSec=rnd.nextInt(60);
		String strTime=String.format("%02d:%02d:%02d",intHour,intMinute,intSec);
		int intQuantity=rnd.nextInt(30)+10;
		ioListVO.setStrProductName(strProductName);
		ioListVO.setStrTradedDate("2019-01-02");
		ioListVO.setStrTradedTime(strTime);
		ioListVO.setintPerPrice(intH*1000);
		ioListVO.setIntQuantity(intQuantity);
		int total=ioListVO.getintPerPrice()*ioListVO.getIntQuantity();
		ioListVO.setIntTotalProductPrice(total);
		
		ioList.add(ioListVO);
	}//input end

	@Override
	public void input(int count) {
		for(int i=0;i<count;i++) {
			input();
		}

	}//input end
	
	public void total() {
		for(IoListVO vo:ioList) {
			int total=vo.getintPerPrice()*vo.getIntQuantity();
			vo.setIntTotalProductPrice(total);
		}
	}//total end

	@Override
	public void view() {
		System.out.println("-----------------------------------------------------");
		System.out.println("거래일람");
		System.out.println("------------------------------------------------------");
		System.out.println("삼품명\t단가\t수량\t판매액\t거래일자\t거래시간");
		System.out.println("-------------------------------------------------------");
		for(IoListVO vo:ioList) {
			System.out.printf("%s\t",vo.getStrProductName());
			System.out.printf("%d\t",vo.getintPerPrice());
			System.out.printf("%d\t",vo.getIntQuantity());
			System.out.printf("%d\t",vo.getIntTotalProductPrice());
			System.out.printf("%s\t",vo.getStrTradedDate());
			System.out.printf("%s\n",vo.getStrTradedTime());
		}
		System.out.println("---------------------------------------------------------");

	}//view end

	@Override
	public void view_A_Product() {
		// TODO Auto-generated method stub

	}//viewaproduct end

}
