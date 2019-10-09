package com.biz.files;

import java.io.IOException;

import com.biz.files.service.FileGradeService;
import com.biz.files.service.FileGradeServiceV2;

public class GradeEx02 {

	public static void main(String[] args) {
		FileGradeService fg=new FileGradeServiceV2();
		String scoreFile="src/com/biz/files/score.txt";
		
		try {
			fg.read(scoreFile);
		}catch(NumberFormatException e) {
			System.out.println("데이터 파일이 잘못됬습니다.");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fg.list();
	}

}
