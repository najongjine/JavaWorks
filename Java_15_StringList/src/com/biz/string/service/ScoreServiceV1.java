package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudentVO;

public class ScoreServiceV1 implements StringService {
	protected List<ScoreVO> scList;
	protected Random rnd=new Random();
	
	public ScoreServiceV1() {
		super();
		scList=new ArrayList<ScoreVO>();
		// TODO Auto-generated constructor stub
	}
	

	public ScoreServiceV1(List<ScoreVO> scList) {
		super();
		this.scList = scList;
	}
	

	public List<ScoreVO> getScList() {
		return scList;
	}


	public void setScList(List<ScoreVO> scList) {
		this.scList = scList;
	}


	@Override
	public void input() {
		
		for(int i=0;i<10;i++) {
			String strNum=String.format("%05d", i+1);
			int intKor=rnd.nextInt(50)+51;
			int intMath=rnd.nextInt(50)+51;
			ScoreVO vo=new ScoreVO();
			vo.setIntKor(intKor);
			vo.setIntMath(intMath);
			vo.setStrNum(strNum);
			total(vo);
			scList.add(vo);
		}
		
	}
	private void total(ScoreVO vo) {
		int total=vo.getIntKor()+vo.getIntMath();
		int avg=total/2;
		
		vo.setIntTotal(total);
		vo.setIntAvg(avg);
	}

	@Override
	public void list() {
		System.out.println("==========================================");
		System.out.println("성적일람표");
		System.out.println("==========================================");
		System.out.println("학번\t국어\t수학\t총점\t평균");
		for(ScoreVO vo:scList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntMath()+"\t");
			System.out.print(vo.getIntTotal()+"\t");
			System.out.print(vo.getIntAvg()+"\n");
		}
		System.out.println("==============================================");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

	@Override
	public StudentVO view(String strNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
