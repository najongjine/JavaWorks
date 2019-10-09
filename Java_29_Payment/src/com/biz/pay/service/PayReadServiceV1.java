package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PayReadServiceV1 {
	private List<String> payStrList;
	
	
	public PayReadServiceV1() {
		super();
		// TODO Auto-generated constructor stub
		payStrList=new ArrayList<String>();
	}
	public List<String> getPayStrList() {
		return payStrList;
	}

	public void setPayStrList(List<String> payStrList) {
		this.payStrList = payStrList;
	}

	public void readPay(String payFile) throws Exception {
		FileReader fr=new FileReader(payFile);
		BufferedReader buffer=new BufferedReader(fr);
		
		while(true) {
			String reader=buffer.readLine();
			if(reader==null) break;
			if(reader.length()<1) continue;
			payStrList.add(reader);
		}
		
		buffer.close();
		fr.close();
	}
}
