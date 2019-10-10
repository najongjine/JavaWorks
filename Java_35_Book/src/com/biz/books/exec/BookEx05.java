package com.biz.books.exec;

import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.ExcelSaveServiceV1;

public class BookEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookReadServiceV1 bRead=new BookReadServiceV1();
		ExcelSaveServiceV1 bExcel=new ExcelSaveServiceV1();
		String bookFile="src/com/biz/books/도서정보.txt";
		String bookSavePath="src/com/biz/books/";
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookVOList=bRead.getBookVOList();
			bExcel.setBookVOList(bookVOList);
			bExcel.excelSave(bookSavePath+"도서정보01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
