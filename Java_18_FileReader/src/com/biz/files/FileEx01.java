package com.biz.files;

import java.io.IOException;

import com.biz.files.service.FileReaderBufferServiceV2;

public class FileEx01 {

	public static void main(String[] args) {
		String fileName="src/com/biz/files/data.txt";
		FileReaderBufferServiceV2 fb=new FileReaderBufferServiceV2();
		try {
			fb.read(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
