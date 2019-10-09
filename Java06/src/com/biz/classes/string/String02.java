package com.biz.classes.string;

public class String02 {

	public static void main(String[] args) {
		String strNation="rㄱㄱ ㄷㄱ435ㅅ34ㅅtt5w34r4ㅈ3ㅅㅈ4ㅅr3wr ";
		String strSearch="r";
		int intLength=strNation.length();
		int index=0;
		
		for(int i=0; i<intLength; i++) {
			//out of bound error가 안나는 이유는 substring(index ,index+1)
			//는 맨 뒤 독성이 index -1 이 되기 때문에
			String strAt= strNation.substring(i, i+1);
			if(strAt.equalsIgnoreCase(strSearch)) {
				System.out.println(i+ " 번째 위치에서 찾음");
			}
			
			
		}

	}

}
