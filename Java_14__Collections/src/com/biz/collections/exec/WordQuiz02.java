package com.biz.collections.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordQuiz02 {

	public static void main(String[] args) {
		String word="once upon a time...";
		List<String> words=Arrays.asList(word.split(""));
		Scanner scan=new Scanner(System.in);
		
		Collections.shuffle(words);
		System.out.println("다음 알파벳을 알맞게 배열하여 문장을 만드시오");
		System.out.println(words);
		System.out.println("-----------------------------");
		System.out.print("입력 > ");
		String str=scan.nextLine();
		
		if(word.equalsIgnoreCase(str)) {
			System.out.println("맞췄습니다!");
		}
		else {
			System.out.println("틀렸습니다.");
			System.out.println("원문: "+word);
		}
	}

}
