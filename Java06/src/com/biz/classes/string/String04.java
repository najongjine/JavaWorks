package com.biz.classes.string;

import java.util.Scanner;

/*
 * strNation에 저ㅗ장된 문자열을 보여주고ㅓ 한개ㅔ의 문자를 키보드로ㅓ 
 * 입력받고 입력한 문자가 몇번째 위치에 있는지를 찾기
 */
public class String04 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		String strNation="ㅕuㅕ grrrrsge tg34t y46u467y etgui7 o8p";
		System.out.println("전체 문자열 : " +strNation);
		int intLength=strNation.length();
		
		System.out.print("찾고싶은 문자 하나를 입력하시오 > ");
		String strSearch=scanner.nextLine(), strAt="";
		System.out.println("입력한 문자: " +strSearch);
		
		for(int i=0; i<intLength; i++) {
			//out of bound error가 안나는 이유는 substring(index ,index+1)
			//는 맨 뒤 독성이 index -1 이 되기 때문에
			strAt= strNation.substring(i, i+1);
			if(strAt.equalsIgnoreCase(strSearch)) {
				System.out.println(i+ " 번째 위치에서 찾음");
				break;
			}
		
		
		}
	}
}