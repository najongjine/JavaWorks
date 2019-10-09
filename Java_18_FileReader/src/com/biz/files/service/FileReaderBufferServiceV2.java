package com.biz.files.service;
/*
 * FileReader 만으로 text파일을 읽기하면
 * OS와 JVM, App사ㅣ에서 데이터가 이동되면서
 * 데이터를 읽는동안 프로세스가 집중되어
 * 매우 비효율적이고, 위험하다.
 * 
 * 고급프로그래밍 에서는 파일을 직접 읽어 메모리로 데이터를 가져오는 대신에
 * 중간에 완충장치를 두어서 안전하게 파일을 읽을수 있도록 하고있다.
 * 그래ㅓㅅ BufferedReader로 연결.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV2 {
	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		/*
		 * fileReader 객체에 담긴 파일읽기 정보를 bufferedReader에게 주입하면 
		 * fileReader와 buffer 사이에서 이미 파일 내용을 읽어서
		 * 메모리 어딘가에 안전하게 보관하고 있을것이다.
		 */
		fileReader=new FileReader(fileName);
		buffer=new BufferedReader(fileReader);
		
		String reader="";
		while(reader!=null) {
			if(reader.equalsIgnoreCase(null)) break;
			reader=buffer.readLine();
			System.out.println(reader);
		}
		buffer.close();
		fileReader.close();
	}
}
