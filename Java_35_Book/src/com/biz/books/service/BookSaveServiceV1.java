package com.biz.books.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.biz.books.domain.BookVO;

public class BookSaveServiceV1 {
	private List<BookVO> bookVOList;
	private PrintWriter fileOut=null;
	

	public List<BookVO> getBookVOList() {
		return bookVOList;
	}

	public void setBookVOList(List<BookVO> bookVOList) {
		this.bookVOList = bookVOList;
	}
	
	public void print(String saveFile) throws Exception {
		fileOut=new PrintWriter(saveFile);
		listTitle();
		for(BookVO bookVO:bookVOList) {
			body(bookVO);
		}
		fileOut.close();
	}
	public void print(String saveFile, String text) throws Exception {
		fileOut=new PrintWriter(saveFile);
		listTitle();
		for(BookVO bookVO:bookVOList) {
			if(bookVO.getB_title().contains(text.trim()))
				body(bookVO);
		}
		fileOut.close();
	}
	public void print(String saveFile, int startPrice, int endPrice) throws Exception {
		fileOut=new PrintWriter(saveFile);
		listTitle();
		for(BookVO bookVO:bookVOList) {
			int price=bookVO.getB_price();
			if(price>=startPrice && price<=endPrice)
				body(bookVO);
		}
		fileOut.close();
	}
	private void listTitle() {
		fileOut.println("========================================================");
		fileOut.println("도서정보V1");
		fileOut.println("========================================================");
		fileOut.println("ISBN\t도서명\t출판사\t날자\t페이지수\t가격\t저자\t역자");
	}
	private void body(BookVO vo) {
		fileOut.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",vo.getB_isbn(),vo.getB_title(),vo.getB_comp(),vo.getB_date(),vo.getB_page(),
				vo.getB_price(),vo.getB_writer(),vo.getB_trans());
	}
}
