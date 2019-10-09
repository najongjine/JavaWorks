package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductServiceV2 {
	protected List<String> proNameList;
	protected List<String> productList;
	
	
	public MakeProductServiceV2() {
		super();
		// TODO Auto-generated constructor stub
		proNameList=new ArrayList<String>();
		productList=new ArrayList<String>();
	}


	public List<String> getProductList(String proFileName) throws Exception {
		FileReader fileReader=new FileReader(proFileName);
		BufferedReader buffer=new BufferedReader(fileReader);
		String reader=new String();
		while(true) {
			reader=buffer.readLine();
			if(reader==null) {
				break;
			}
			if(reader.length()<1) continue; //enter쳐진거 읽기 방지
			proNameList.add(reader);
		}
		buffer.close();
		fileReader.close();
		/*
		 * 파일을 읽기 위해서 reader로 오픈을 한후
		 * while 반복문 내에서 한줄씩 읽어서 여러가지 연산을 수행하는 과정에서
		 * 연산수행 시간이 오래 걸리거나
		 * 어떤 exception이 발생할 확율이 조금이라도 있다면
		 * 읽어들인 문자열을 List<String> type list로 생성을 하고
		 * 파일을 close 한후
		 * 생성된 list를 사용하여 다른 연산을 수행하자
		 */
		
		//상품가격을 800~5000원 까지 임의값 생성
		for(String pro:proNameList) {
			int price=(int)(Math.random()*(5000-800+1)+800);
			
			price=(int)((price+5)/10)*10;
			//int _price=((int)(price/10))*10;
			//price=(int)(((float)price/10+0.5))*10;
			
			String product= String.format("%s:%d", pro,price);
			productList.add(product);
		}
		return productList;
		
	}
}
