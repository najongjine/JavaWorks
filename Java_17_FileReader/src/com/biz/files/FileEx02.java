package com.biz.files;

import java.io.IOException;

import com.biz.files.service.BufferedReaderService;
/*
 * FileReader Class
 * txt 파일을 직접 읽어서 문자 단위로 CPU로 전송하여 연산을 수행할때 사용.
 * 파일을 direct로 읽어서 처리를하기 때문에 파일이 매우 크면 
 * app실행 속도가 ㅈㄹ 느려짐.
 * 파일 읽기까 다 끝날때까지 app이 계속 돌고, 파일은 계속 OPEN 상태이고, 사용자는 기다려야함
 */
import com.biz.files.service.FileReaderServiceV2;

public class FileEx02 {

	public static void main(String[] args) {
		FileReaderServiceV2 fs=new FileReaderServiceV2();
		BufferedReaderService bs=new BufferedReaderService();//여기까지가 표준
		
		String file="src/com/biz/files/data.txt";//파일 리더한테 이 문자열 넘기면 파일 리더가 이 경로에서 파일 찾아옴.
		try {
			bs.Read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
