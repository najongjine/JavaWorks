package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.iolist.domain.BuyVO;

public class IoListService {
	protected List<String> proList;
	protected List<BuyVO> buyList;
	
	
	public IoListService() {
		super();
		// TODO Auto-generated constructor stub
		buyList=new ArrayList<BuyVO>();
	}

	public void buyMake() {
		Random rnd=new Random();
		BuyVO buyVO;
		for(int i=0;i<20;i++) {
			buyVO=new BuyVO();
			buyVO.setDate("2019-09-26");
			String[] _str=proList.get(i).split(":");
			buyVO.setProName(_str[0]);
			int price=Integer.valueOf(_str[1]);
			price=(int)(price/1.1);
			buyVO.setPrice(price);
			buyVO.setVat(Integer.valueOf(_str[1])-buyVO.getPrice());
			int qty=rnd.nextInt(91)+10;
			buyVO.setQty(qty);
			buyVO.setTotal(buyVO.getQty()*buyVO.getPrice());
			
			buyList.add(buyVO);
		}
		
		System.out.printf("날자\t\t단가\t상품명\t\t수량\t합계\tvat\n");
		for(BuyVO bVO: buyList) {
			System.out.printf("%s\t%d\t%s\t%d\t%d\t%d\n",bVO.getDate(),bVO.getPrice(),bVO.getProName()
					,bVO.getQty(),bVO.getTotal(),bVO.getVat());
		}
		System.out.println("수량:" +buyList.get(0).getQty());
		System.out.println("합계:" +buyList.get(0).getTotal());
		
	}
	
	public void readProduct(String proFileName) throws Exception {
		proList=new ArrayList<String>();
		FileReader fr=new FileReader(proFileName);
		BufferedReader buffer=new BufferedReader(fr);
		
		String reader=new String();
		while(true) {
			reader=buffer.readLine();
			if(reader==null) break;
			if(reader.length()<1) continue;
			proList.add(reader);
		}
		buffer.close();
		fr.close();
	}
}
