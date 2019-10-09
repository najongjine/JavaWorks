package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV1 {
	List<PaperVO> paperList;
	
	public PaperMakeServiceV1() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public List<PaperVO> getPaperList() {
		return paperList;
	}
	
	public void setPaperList(List<PaperVO> paperList) {
		this.paperList = paperList;
	}

	public void make(int pay) {
		paperList=new ArrayList<PaperVO>();
		int paper=50000;
		int sw=1;
		for(;paper>5;) {
			int paperCount=pay/paper;
			PaperVO paperVO=new PaperVO();
			paperVO.setPaper(paper+"");
			paperVO.setCount(paperCount);
			paperList.add(paperVO);
			pay-=paper*paperCount;
			if(sw>0) {
				paper/=5;
			}
			else {
				paper/=2;
			}
			sw*=-1;
		}
	}
}
