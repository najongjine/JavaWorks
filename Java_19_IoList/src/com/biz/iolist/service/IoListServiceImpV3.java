package com.biz.iolist.service;

import com.biz.iolist.domain.IoListVO;

public class IoListServiceImpV3 extends IoListServiceImpV1 {

	public void list() {
		this.list_header();
		int intITotal=0;
		int intOTotal=0;
		for(IoListVO vo:ioList) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrPName()+"\t");
			int intIO=Integer.valueOf(vo.getStrIO());
			int intIProduct=0;
			int intOProduct=0;
			String strIoTitle="";
			if(intIO==1) {
				strIoTitle="매입";
				intIProduct=vo.getIntPrice();
				intITotal+=intIProduct*vo.getIntQty();
				intOProduct=0;
				
			}else {
				strIoTitle="매출";
				intIProduct=0;
				intOProduct=vo.getIntPrice();
				intOTotal+=intOProduct*vo.getIntQty();
			}
			System.out.print(strIoTitle+"\t");
			System.out.print(vo.getIntPrice()+"\t");
			System.out.print(vo.getIntQty()+"\t");
			System.out.printf("%8d\t",intIProduct*vo.getIntQty());
			System.out.printf("%8d\n",intOProduct*vo.getIntQty());
		}
		System.out.println("=============================================================================");
		System.out.println("\t\t\t\t\t\t\t\t"+intITotal+"\t"+intOTotal);
	}
	
	protected void list_header() {
		System.out.println("===================================================");
		System.out.println("거래일자\t상품명\t\t구분\t단가\t수량\t매입금액\t매출금액");
		System.out.println("====================================================");
	}

}
