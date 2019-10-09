package com.biz.string;

public class String01 {

	public static void main(String[] args) {
		
		//String class에 포함되어있는 메서드들중에 일부를 strNation
		//문자열 변수가 물려 받는다
		//strNation.method() 들을 이용해서 여러 기능들을 구현할수있음.
		String strNation="Republic Of Korea";
		String sUpper=strNation.toUpperCase();
		String strKorea=strNation.substring(12);//12 부터 뒤에있는거 쭉
		String strPub=strNation.substring(2,8);// 2~ 8-1 위치
		
		System.out.println(strPub);
		
		// 표현할땐 String.length()
		int intLength=strNation.length();//사용할때
		
		for(int i=0; i<intLength; i++) {
			//반복되는 횟수는 intLength 만큼
			//i값은 0~intLength - 1
			//햇갈리면 안됨
			char cA=strNation.charAt(i);
			
			//System.out.println(i+ " 번째 :" + cA);
		}
		
		String strString1="aaa";
		String strString2="aaa";
		
		boolean bVar= false;
		
		bVar= strString1.equals(strString2);
		bVar= strString1.equalsIgnoreCase(strString2);//대소문자 구분 안함
		
		if(bVar) {
			System.out.println();
		}
	}
}
