package com.biz.iolist.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WriteProductService {
	List<String> productList;
	
	
	public WriteProductService() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public WriteProductService(List<String> productList) {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public void productWrite(String proWriteFile) throws Exception {
		if(productList==null) {
			System.out.println("상품 리스트가 없음!!");
			return;
		}
		FileWriter fw=new FileWriter(proWriteFile);
		PrintWriter fileOut=new PrintWriter(fw);
		for(String pro:productList) {
			fileOut.println(pro);
		}
		fileOut.flush();
		fileOut.close();
	}
	public void setProList(List<String> productList) {
		this.productList=productList;
	}
}
