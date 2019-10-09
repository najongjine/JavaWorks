package com.biz.practice.service;

public class PhoneNumDupCheck {
	public boolean solution(String[] phone_book) {
		boolean answer=true;
		for(int i=0;i<phone_book.length;i++) {
			int beginIndex=0,endIndex=0;
			for(int j=i+1;i<phone_book.length;j++) {
				for(;endIndex<phone_book[j].length();) {
					endIndex+=phone_book[i].length();
					if(phone_book[i].compareToIgnoreCase(phone_book[j].substring(beginIndex, endIndex))==0) {
						answer = false;
					}
					beginIndex+=endIndex;
				}
			}
		}
        return answer;
    }
}
