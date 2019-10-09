package com.biz.collections.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordQuiz01 {

	public static void main(String[] args) {
		String strWord="Yestarday";
		String[] words=strWord.split("");//문자열을 알파벳 단위로 잘라서 문자열 배열로 만들어줌.
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		List<String> alphaList= Arrays.asList(words);//문자열을 리스트로
		System.out.println(alphaList.toString());
		
		Collections.shuffle(alphaList);
		System.out.println(alphaList.toString());

	}

}
