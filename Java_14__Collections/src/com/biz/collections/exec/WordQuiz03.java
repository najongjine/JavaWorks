package com.biz.collections.exec;

import com.biz.collections.service.WordService;

public class WordQuiz03 {

	public static void main(String[] args) {
		WordService ws=new WordService();
		while(true) {
			if(ws.input()) {
				break;
			}
		}
		System.out.println("END");

	}

}
