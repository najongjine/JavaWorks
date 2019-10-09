package com.biz.string.service;

import java.util.List;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudentVO;

public class ScoreServiceV2 extends ScoreServiceV1 {
	protected List<StudentVO> stdList=null;
	@Override
	public void list() {
		//super.list();
		System.out.println("==========================================================");
		System.out.println("성적일람표");
		System.out.println("==========================================================");
		System.out.println("학번\t이름\t국어\t수학\t총점\t평균");
		for(ScoreVO vo:scList) {
			String strNum=vo.getStrNum();
			StudentVO stVO=this.searchStd(strNum);
			
			String strName, strAddr, strTel;
			if(stVO==null){
				strName="없음";
				strAddr="없음";
				strTel="없음";
			}else {
				strName=stVO.getStrName();
				strAddr=stVO.getStrAddr();
				strTel=stVO.getStrTel();
			}
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(strName+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntMath()+"\t");
			System.out.print(vo.getIntTotal()+"\t");
			System.out.print(vo.getIntAvg()+"\n");
		}
		
	}
	private StudentVO searchStd(String strNum) {
		for(StudentVO vo:stdList) {
			if(vo.getStrNum().equalsIgnoreCase(strNum)) {
				return vo;
			}
		}
		return null;
	}
	public List<StudentVO> getStdList() {
		return stdList;
	}
	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}
	

}
