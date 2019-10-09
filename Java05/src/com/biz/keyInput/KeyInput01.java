package com.biz.keyInput;

import java.util.Scanner;

/*
 * interactive. 대화형.
 */
public class KeyInput01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 키보드에서 무언가를 입력하면 
		 * 그 내용을 수신하여 문자열로 변환시켜주는 클래스.
		 * 
		 * Scanner 클래스는 직접 어떤일을 수행할수 없고 반드시 변수로
		 * 선언을 해 주어야한다.
		 * 
		 * 클래스마다 사용준비가 다다름
		 * 
		 * System.in:= 키보드와 JVM 사이에서 키보드의 전기신호를 2진수 정보로
		 * 변환시키는 역활을 수행하는 클래스
		 * 
		 *  new Scanner():=생성자 메서드. scanner 객체를 사용할수 있도록
		 *  생성, 초기화를 수행한다.
		 */
		Scanner scanner=new Scanner(System.in);
		
		String strKeyIn=new String();
		
		/*
		 * 이 코드가 실행이 되면 프로젝트는 모든 진행을 멈추고
		 * 키보드에 뭔가 입력되기를 기다림.
		 */
		System.out.print("문자열 입력후 enter키 누르시오 > ");
		strKeyIn= scanner.nextLine();
		
		System.out.println("입력된 문자열: " +strKeyIn);
	}

}
