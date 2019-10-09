package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * data.txt 파일을 읽어서 기억장치로 가져 오려고 한다.
 * 1. 운영체제에게 data.txt 파일을 읽을테니 허락을 해달라고 요청(FileReader 클래스가 대신 해줌).
 */
public class FileEx01 {

	public static void main(String[] args) {
		String file="src/com/biz/files/data.txt";//위치파일
		
		/*
		 *OS에게 파일을 읽을테니 허락해달라라는 요청과
		 *OS가 허락하면 읽을 파일에대한 정보를 java코드에서
		 *사용할수 있도록 준비해주는 클래스.
		 *읽고자 하는 파일이름을 파일이 저장된 폴더 path까지 
		 *문자열 형태로 전달하면서 객체로 생성해주면 된다. 
		 */
		FileReader fileReader = null;
		
		try {
			/*
			 * FileReader클래쇼ㅡ를 사용해서 파일을 읽ㅇ늘 준빙를 수행하는데
			 * 알수없는 여러가지 이유로 파일을 읽는데 문제가 발생할수 있다.
			 * 이때
			 * 만약 파일이 어떤 이유로 지워졌을경우 FileNotFouyndException이 발생할 확율이 있다.
			 * 그래서 파일을 읽기위한 객체 생성(초기화)명령문은 반드시 try cathch문으로
			 * 감싸도록 되어 있다.
			 * 또한 FileReader의 선언문과 생성문을 분리를 하는데 그 이유는
			 * fileRader객체에 접근할수 있는 scope문제를 해결하기 위한 것이다.
			 */
			int alpha=0; 
			fileReader=new FileReader(file);
			for(;alpha>-1;) { 
				alpha=fileReader.read();//파일을 다 읽고다면 -1(or below) 리턴
				System.out.print((char)alpha);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
