package com.biz.collections.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {
	private List<String> wordList;
	private String word;
	private List<String> words;
	private Scanner scan;
	public int count;
	public WordService() {
		super();
		scan=new Scanner(System.in);
		wordList=new ArrayList<String>();
		wordList.add("cook");
		wordList.add("lion");
		wordList.add("cheetah");
		wordList.add("goat");
		wordList.add("sparrow");
		wordList.add("duck");
		wordList.add("human");
		wordList.add("computer");
		wordList.add("school");
		
		count=0;
	}
	public void makeWord() {
		Collections.shuffle(wordList);
		word=wordList.get(0);
		
		//단어를 알파벳 단위로 나누어서 리스트로 변환
		words=Arrays.asList(word.split(""));
		
		Collections.shuffle(words);
		
	}
	public boolean input() {
		
		this.makeWord();
		
		System.out.println("---------------------------------");
		System.out.println("단어맞추기");
		System.out.println("---------------------------------");
		System.out.println(words);
		System.out.print("단어를 입력하세요 > ");
		String str=scan.nextLine();
		if(str.equalsIgnoreCase(word)) {
			System.out.println(++count+" 번 만에 맞추었습니다!");

		}
		else {
			System.out.println("틀렸습니다");

		}
		System.out.println("press any key to continue...(-1:END)");
		String anyStr=scan.nextLine();
		if(anyStr.equalsIgnoreCase("-1")) {
			return true;
		}
		return false;
	}
	
}
