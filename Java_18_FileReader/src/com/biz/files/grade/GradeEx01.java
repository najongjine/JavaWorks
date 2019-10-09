package com.biz.files.grade;

import java.io.IOException;

import com.biz.files.service.FileGradeServiceV1;

public class GradeEx01 {

	public static void main(String[] args) {
		String fileName="src/com/biz/files/score.txt";
		FileGradeServiceV1 gs=new FileGradeServiceV1();
		
		try {
			gs.read(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gs.list();
	}

}
