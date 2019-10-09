package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.domain.ScoreVO;

public class FileGradeServiceV1 implements FileGradeService{
	List<ScoreVO> scoreList;

	public FileGradeServiceV1() {
		super();
		// TODO Auto-generated constructor stub
		scoreList=new ArrayList<ScoreVO>();
	}

	public FileGradeServiceV1(List<ScoreVO> scoreList) {
		super();
		this.scoreList = scoreList;
	}
	
	public void read(String fileName) throws IOException {
		FileReader fr;
		BufferedReader buffer;
		fr=new FileReader(fileName);
		buffer=new BufferedReader(fr);
		
		String reader=new String();
		
		while(true) {
			reader=buffer.readLine();
			if(reader==null) break;
			String[] scores=reader.split(":");
			int index=0;
			String strNum="";
			int intKor=0;
			int intEng=0;
			int intMath=0;
			try {

				strNum=String.valueOf(scores[index++]);
				intKor=Integer.valueOf(scores[index++]);
				intEng=Integer.valueOf(scores[index++]);
				intMath=Integer.valueOf(scores[index++]);
					

			}catch(Exception e) {
				System.out.println(strNum+" 데이터 문제 있음");
				break;
			}
			
			ScoreVO vo=new ScoreVO();
			vo.setIntEng(intEng);
			vo.setIntKor(intKor);
			vo.setIntMath(intMath);
			vo.setStrNum(strNum);
			
			scoreList.add(vo);
			
		}
		buffer.close();
		fr.close();
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("==================================");
		System.out.println("성적일람표");
		System.out.println("======================================");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("===========================================");
		for(ScoreVO vo:scoreList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntEng()+"\t");
			System.out.print(vo.getIntMath()+"\n");
		}
		System.out.println("==========================================");
		
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		
	}
	
}
