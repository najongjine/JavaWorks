package com.biz.books.service;

import java.util.List;

import com.biz.books.domain.BookVO;

public class BookViewServiceV1 {
	List<BookVO> bookVOList;
	
	public List<BookVO> getBookVOList() {
		return bookVOList;
	}
	public void setBookVOList(List<BookVO> bookVOList) {
		this.bookVOList = bookVOList;
	}

	public void search(String text) {
		listTitle();
		for(BookVO vo:bookVOList) {
			if(vo.getB_title().contains(text.trim())) {
				body(vo);
			}
		}
		System.out.println("============================================================");
	}
	public void search(int startPrice, int endPrice) {
		listTitle();
		for(BookVO vo:bookVOList) {
			int price=vo.getB_price();
			if(price>=startPrice && price <= endPrice){
				body(vo);
			}
		}
		System.out.println("============================================================");
	}
	private void listTitle() {
		System.out.println("========================================================");
		System.out.println("도서정보V1");
		System.out.println("========================================================");
		System.out.println("ISBN\t도서명\t출판사\t날자\t페이지수\t가격\t저자\t역자");
	}
	private void body(BookVO vo) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",vo.getB_isbn(),vo.getB_title(),vo.getB_comp(),vo.getB_date(),vo.getB_page(),
				vo.getB_price(),vo.getB_writer(),vo.getB_trans());
	}
	public void viewList() {
		listTitle();
		for(BookVO vo:bookVOList) {
			body(vo);
		}
		System.out.println("============================================================");
	}
}
