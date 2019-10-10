package com.biz.books.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.utils.BookSettings;

public class BookReadServiceV1 {
	private List<BookVO> bookVOList;

	public BookReadServiceV1() {
		super();
		// TODO Auto-generated constructor stub
		bookVOList=new ArrayList<BookVO>();
	}
	public List<BookVO> getBookVOList() {
		return bookVOList;
	}

	public void readBookInfo(String bookFile) throws Exception {
		String[] bookInfo;
		FileReader fr=new FileReader(bookFile);
		BufferedReader buffer=new BufferedReader(fr);
		
		int lineNum=0;
		while(true) {
			System.out.println(++lineNum);
			String reader=buffer.readLine();
			if(reader==null) break;
			if(reader.length()<1) continue;
			bookInfo=reader.split(":");
			//ISBN 0: 출판사 1: 도서명 2: 저자 3: 역자 4: 발행일 5: 페이지 6: 가격 7
			String b_isbn=bookInfo[BookSettings.FILE.ISNB];
			String b_title=bookInfo[BookSettings.FILE.TITLE];
			String b_writer=bookInfo[BookSettings.FILE.WRITER];
			String b_comp=bookInfo[BookSettings.FILE.COMP];
			String b_trans=bookInfo[BookSettings.FILE.TRANS];
			String strPrice=bookInfo[BookSettings.FILE.PRICE].trim();
			int b_price=Integer.valueOf(strPrice);
			String strPage=bookInfo[BookSettings.FILE.PAGE].trim();
			int b_page=Integer.valueOf(strPage);
			String b_date=bookInfo[BookSettings.FILE.DATE];
			BookVO bookVO=new BookVO();
			bookVO.setB_isbn(b_isbn);
			bookVO.setB_comp(b_comp);
			bookVO.setB_date(b_date);
			bookVO.setB_page(b_page);
			bookVO.setB_price(b_price);
			bookVO.setB_title(b_title);
			bookVO.setB_trans(b_trans);
			bookVO.setB_writer(b_writer);
			
			bookVOList.add(bookVO);
		}
		
		buffer.close();
		fr.close();
	}
	
}
