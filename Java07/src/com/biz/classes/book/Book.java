package com.biz.classes.book;

public class Book {
	public String strBookTitle;//도서명
	public String strPublishHouse;//출판사
	public String strAuthor;//저자
	public int intPrice;//가격
	
	//도서의 개별 정보
	//도서 리스트 보기
	public void viewBookInfo() {
		System.out.println("--------------"+strBookTitle + " 도서의 정보-------------");
		System.out.println("출판사: "+strPublishHouse);
		System.out.println("저자: "+strAuthor);
		System.out.println("가격: "+intPrice+"원");
		System.out.println("------------------------------------------------");
	}
	public void viewBookAsList() {
		System.out.print("도서명: "+strBookTitle+"\t");
		System.out.print("출판사: "+strPublishHouse+"\t");
		System.out.print("저자: "+strAuthor+"\t");
		System.out.print("가격: "+intPrice+"원\t");
		System.out.println();
	}
}
