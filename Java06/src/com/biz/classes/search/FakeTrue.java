package com.biz.classes.search;

import java.util.Scanner;

public class FakeTrue {

	public static void main(String[] args) {
		String strNation ="Republic of Korea";
		System.out.println(strNation);
		int intLength=strNation.length(), reachedMax=0;;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("1개의 문자를 입력 하세요 > ");
		String strS=scanner.nextLine();
		
		int index=0;
		for(index=0;index<intLength;index++) {
			String strAt=strNation.substring(index, index+1);
			if(strAt.equalsIgnoreCase(strS)) {
				System.out.println(index+"번째에서 찾음\n");
				break;
			}
			else {
				System.out.println("없는 문자열 \n");
			}
		}

	}

}
