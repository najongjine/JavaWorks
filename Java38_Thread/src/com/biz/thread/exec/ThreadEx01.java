package com.biz.thread.exec;

import java.util.Scanner;

import com.biz.thread.classes.RunThreadV1;

/*
 * 프로세스:=한개의 컴퓨터( or os)에서 작동되는 프로그램들(예: excel, mp3player)
 * 
 * multiprocess | multitasking:=프로세스가 동시에 작동되는 환경
 * 
 * 한개의 Process내부에서 작은 단위의 일(job)들을 분활하고
 * 이들을 동시에 작동하도록 하는 환경
 * 
 * 키보드에서 무언가 입력을 하도록 기다리면서 또다른 한편으로 1~100까지 덧셈을 수행하여 콘솔에 보이고록
 * 하고싶다.
 */
public class ThreadEx01 {
	public static void main(String[] args) {
		RunThreadV1 rt=new RunThreadV1();
		Scanner scanner=new Scanner(System.in);
		rt.start();
		System.out.print("아무글자나 입력 >> ");
		String strAny=scanner.nextLine();
		System.out.println("입력한 글자: "+strAny);
		
		
		
		Integer.valueOf(strAny);
	}
}
