package com.biz.classes.book;

public class BookExec {

	public static void main(String[] args) {
		Book book01=new Book();
		
		book01.intPrice=5000;
		book01.strAuthor="박종진";
		book01.strBookTitle="재밌는책";
		book01.strPublishHouse="내 집";
		book01.viewBookInfo();
		book01.viewBookAsList();

	}

}
