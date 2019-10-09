package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {
	FileReader fileReader=null;
	
	public void read(String fileName) throws IOException {
		fileReader=new FileReader(fileName);
		
		int intChar=0;
		while(intChar>-1) {
			intChar=fileReader.read();
			System.out.print((char)intChar);
		}
		fileReader.close();
	}
}
