package com.biz.string.service;

public class StudentScoreService extends StudentServiceV1 implements StudentScore {
	public void view() {
		for(int i=0; i<stdList.size();i++) {
			System.out.print(stdList.get(i).getStrNum()+"\t");
			System.out.print(stdList.get(i).getStrName()+"\t");
			System.out.print(scList.get(i).getIntAvg()+"\n");
		}
	}
}
