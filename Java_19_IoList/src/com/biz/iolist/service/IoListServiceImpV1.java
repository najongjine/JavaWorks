package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.iolist.domain.IoListVO;

public class IoListServiceImpV1 implements IoListService {
	protected List<IoListVO> ioList;
	

	public IoListServiceImpV1() {
		super();
		ioList=new ArrayList<IoListVO>();
	}

	@Override
	public void read(String fileName) throws Exception {
		FileReader fr=new FileReader(fileName);
		BufferedReader buffer=new BufferedReader(fr);
		
		String strBuffer="";
		int intPrice=0;
		int intQty=0;
		String strDate="";
		String strIO="";
		String strPName="";

		while(true) {
			int index=0;
			strBuffer=buffer.readLine();
			if(strBuffer==null) break;
			String[] _str=strBuffer.split(":");
			strDate=String.valueOf(_str[index++]);//date
			strPName=String.valueOf(_str[index++]);//상품명
			strIO=String.valueOf(_str[index++]);//1==매입	2==매출
			intPrice=Integer.valueOf(_str[index++]);//단가
			intQty=Integer.valueOf(_str[index++]);//수량
			
			IoListVO vo=new IoListVO();
			vo.setIntPrice(intPrice);
			vo.setIntQty(intQty);
			vo.setStrDate(strDate);
			vo.setStrIO(strIO);
			vo.setStrPName(strPName);
			ioList.add(vo);
			
			//System.out.println(strBuffer);
		}
		
		buffer.close();
		fr.close();

	}//read end

	@Override
	public void list() {//1==매입	2==매출
		// 거래밍자 상품명 구분 매입단가 매출단가 수량
		String strIoTitle="";
		list_header();
		for(IoListVO vo:ioList) {
			System.out.printf("%s\t",vo.getStrDate());
			System.out.printf("%s\t",vo.getStrPName());
			if(vo.getStrIO().equalsIgnoreCase("1")) {
				strIoTitle="매입";
				System.out.print("매입\t");
				System.out.printf("%8d\t",vo.getIntPrice());
				System.out.printf("%8d\t",0);
			}
			else if(vo.getStrIO().equalsIgnoreCase("2")) {
				strIoTitle="매출";
				System.out.print("매출\t");
				System.out.printf("%8d\t",0);
				System.out.printf("%8d\t",vo.getIntPrice());
			}
			System.out.printf("%4d\n",vo.getIntQty());
		}
		System.out.println("=======================================================");
	}
	protected void list_header() {
		System.out.println("===================================================");
		System.out.println("거래일자\t상품명\t\t구분\t매입단가\t매출단가\t수량");
		System.out.println("====================================================");
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub

	}

}
