package com.biz.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="src/com/biz/filewriter/data3.txt";
		FileWriter fileWriter;
		BufferedWriter buffer;
		
		try {
			fileWriter=new FileWriter(fileName,true);
			buffer=new BufferedWriter(fileWriter);
			String str=String.format("%20s\n", "republic of Korea");
			//fileWriter.write(str);
			/*
			 * buffer.write() method로 데이터를 기록하면
			 * 메모리의 buffer영역을 만들고 데이터를 기록한다.
			 * buffer 메모리 영역이 가득차면 JVM과 OS는 자동으로 해당 내용을 파일에 기록한다.
			 */
			buffer.write(str);
			
			//현재 버퍼에 저장되어있는 내용을 파일에 강제로 기록하라.
			//close() 는 한번 닫아버리면 기록을 못함.
			buffer.flush();
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
