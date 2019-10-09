package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="src/com/biz/filewriter/data1.txt";
		try {
			FileWriter fileWriter=new FileWriter(fileName);
			fileWriter.write("test sentence1");
			fileWriter.write(99);
			fileWriter.write("\n");
			for(int i='A';i<'Z'+1;i++) {
				fileWriter.write(i);
			}
			
			/*
			 * 파일을 기록할때 wrtie() method는 직접 파일을 기록하지만
			 * JVM이 임시로 기억장치 어딘가에 모아둔다.
			 * 만약 close() 하지않고 프로젝트가 끝나면 JVM이 모아둔 데이터는
			 * 사라져 버린다.
			 * close()를 실행하면 JVM이 OS에게 해당 데이터를 전달하고 파일에 기록해달라고 요청한다.
			 */
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
