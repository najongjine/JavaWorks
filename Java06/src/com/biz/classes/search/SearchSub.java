package com.biz.classes.search;

import java.util.Scanner;

public class SearchSub {
	/*
	 * 임의의 문자열중에 한개의 문자열을 찾는 클래스
	 * 
	 * 1. 임의의 문자열을 제시함
	 * 2. 키보드에서 1개의 문자를 입력받음
	 * 3. 해당하는 문자열이 몇번째 위치에 있나?
	 */

	public String strNation="Republic of Korea";
	public void main() {
		//String strNation ="Republic of Korea";
		System.out.println(strNation);
		int intLength=strNation.length(), reachedMax=0;;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("1개의 문자를 입력 하세요 > ");
		String strS=scanner.nextLine();
		
		int index=0;
		for(index=0;index<intLength;index++) {
			String strAt=strNation.substring(index, index+1);
			if(strAt.equalsIgnoreCase(strS)) {
				break;
			}
		}
		System.out.println(index);
		
		if(index<intLength)
			System.out.println(index+"번째에서 찾음\n");
		else
			System.out.println("없는 문자열 \n");
		
		
	}

}
