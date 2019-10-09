package com.biz.classes.search;

import java.util.Scanner;

public class SearchMain {
	
	public static void main(String[] args) {
		SearchSub ss= new SearchSub();
		Scanner scanner = new Scanner(System.in);
		
		ss.strNation="UNITED NATION";
		
		//for는 일반적으로 시작값과 최대값이 정해진 경우에 사용
		//어떤 조건에 따라 무한 또는 유한반복할땐 while을 씀
		while(true) {
			ss.main();
			System.out.println("계속 하려면 아무키나 누르세요");
			System.out.println("종료하려면 END를 입력하세요");
			String anyKey=scanner.nextLine();
			if(anyKey.equals("END")) {
				break;
			}
		}
		System.out.println("\n Pgromgram is ended");
		
	}	
}
