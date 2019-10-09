package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {
	FileReader fileReader=null;
	
	public void read(String fileName) throws IOException {
		fileReader=new FileReader(fileName);
		int al=0;
		while(al>-1) {
			al=fileReader.read();
			System.out.printf("%d: %c\n",al,(char)al);
		}
	}
}
