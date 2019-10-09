package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.biz.files.domain.ScoreVO;

public class FileGradeServiceV2 extends FileGradeServiceV1 {

	@Override
	public void read(String fileName) throws IOException {
		// TODO Auto-generated method stub
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
				//System.out.println(strNum+" 데이터 문제 있음");
				//break;
				//어떤 exception이 발생했는지 호출한곳에 구체적으로 알려줌.
				throw new NumberFormatException();
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
	}// end read
	
	public void total() {
		for(ScoreVO vo:scoreList) {
			int intTotal=vo.getIntEng()+vo.getIntKor()+vo.getIntMath();
			vo.setIntTotal(intTotal);
			
			vo.setIntAvg(intTotal/3);
		}
	}
	
	public void list() {
		System.out.println("==================================");
		System.out.println("성적일람표");
		System.out.println("======================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================");
		for(ScoreVO vo:scoreList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.printf("%3d\t",vo.getIntKor());
			System.out.printf("%3d\t",vo.getIntEng());
			System.out.printf("%3d\t",vo.getIntMath());
			System.out.printf("%5d\t",vo.getIntTotal());
			System.out.printf("%3d\n",vo.getIntAvg());
		}
		System.out.println("==========================================");
	}
	
}
