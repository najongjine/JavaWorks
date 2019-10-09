package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV2 {
	FileReader fileReader=null;
	
	public void read(String fileName) throws IOException {
		fileReader=new FileReader(fileName);
		int al=0;
		while(al>-1) {
			al=fileReader.read();
			System.out.print((char)al);
		}
	}
}
