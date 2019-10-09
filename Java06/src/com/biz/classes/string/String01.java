package com.biz.classes.string;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		String strNation="ㅕuㅕ grrrrsge tg34t y46u467y etgui7 o8p";
		System.out.println("전체 문자열 : " +strNation);
		
		System.out.print("찾고싶은 문자나 문자열을 입력하시오 > ");
		String strSearch=scanner.nextLine(), strAt="";
		System.out.println("입력한 문자: " +strSearch);
		
		int intLength=strNation.length();
		int []index= new int[intLength];
		for(int i=0; i<intLength; i++) {
			index[i]=-1;
		}
	
		for(int i=0, j=0; i<intLength; i++) {
			
			strAt=strNation.substring(i, i+1);
			if(strAt.equalsIgnoreCase(strSearch)) {
				index[j++]=i;
			}
		}
		System.out.print("\n 찾고자 하는 문자 " +strSearch+"는 문자열에서 ");
		for(int i=0; i<intLength; i++) {
			if(index[i]!= -1) {
				System.out.print(index[i]);
				if(i+1 < intLength) {
					if(index[i+1]!= -1) {
						System.out.print(", ");
					}
				}
			}
			
					
		}
		if(index[0]!= -1) {
			System.out.println("번째에 위치해 있습니다.");
		}
		else {
			System.out.println("없습니다");
		}
		
		
	}

}
