package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperPrintServiceV1 {
	PayReadServiceV1 prs;
	PaperMakeServiceV1 pms;
	String payFile;
	List<List<PaperVO>> paperAllList;
	
	public PaperPrintServiceV1() {
		super();
		// TODO Auto-generated constructor stub
		prs=new PayReadServiceV1();
		pms=new PaperMakeServiceV1();
	}
	public PaperPrintServiceV1(String payFile) {
		this();
		this.payFile = payFile;
	}
	public void setPayFile(String payFile) {
		this.payFile=payFile;
	}
	public PayReadServiceV1 getPrs() {
		return prs;
	}
	public void setPrs(PayReadServiceV1 prs) {
		this.prs = prs;
	}
	public PaperMakeServiceV1 getPms() {
		return pms;
	}
	public void setPms(PaperMakeServiceV1 pms) {
		this.pms = pms;
	}
	
	public void viewPaper() throws Exception {
		prs=new PayReadServiceV1();
		pms=new PaperMakeServiceV1();
		paperAllList=new ArrayList<List<PaperVO>>();
		prs.readPay(payFile);
		List<String> payStrList=prs.getPayStrList();
		for(String pay:payStrList) {
			String[] pays=pay.split(":");
			int intPay=Integer.valueOf(pays[1]);
			pms.make(intPay);
			List<PaperVO> paperList=pms.getPaperList();
			
			/*System.out.println("==============================================");
			System.out.print("사원번호: "+pays[0]);
			System.out.print(", 급여액: "+pays[1]);
			System.out.println();
			System.out.println("-------------------------------------------------");*/
			
			
			paperAllList.add(paperList);
		
			/*for(PaperVO pVO:paperList) {
				System.out.printf("%s\t%d\n",pVO.getPaper(),pVO.getCount());
			}*/
		}
		
	}//end
	public void printPaper() throws Exception {
		prs=new PayReadServiceV1();
		pms=new PaperMakeServiceV1();
		paperAllList=new ArrayList<List<PaperVO>>();
		prs.readPay(payFile);
		List<String> payStrList=prs.getPayStrList();
		for(String pay:payStrList) {
			String[] pays=pay.split(":");
			int intPay=Integer.valueOf(pays[1]);
			pms.make(intPay);
			List<PaperVO> paperList=pms.getPaperList();
			paperAllList.add(paperList);
		}
	}
	public void printPaperNID() {
		for(int i=0;i<prs.getPayStrList().size();i++) {
			System.out.println("----------------------------------------------------");
			System.out.println(prs.getPayStrList().get(i));
			for(PaperVO pvo: pms.getPaperList()) {
				System.out.println(pvo.getPaper()+"\t"+pvo.getCount());
			}
			System.out.println("-----------------------------------------------------");
		}
	}
}
