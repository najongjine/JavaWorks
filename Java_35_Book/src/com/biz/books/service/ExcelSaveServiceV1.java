package com.biz.books.service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import com.biz.books.domain.BookVO;

public class ExcelSaveServiceV1 {
	private List<BookVO> bookVOList;
	int listSize=10;
	private String excelExt=".csv";
	BufferedWriter buffer;

	public List<BookVO> getBookVOList() {
		return bookVOList;
	}
	public void setBookVOList(List<BookVO> bookVOList) {
		this.bookVOList = bookVOList;
	}
	private void bufferOpen(String fileName) throws Exception {
		FileOutputStream fo=new FileOutputStream(fileName+excelExt);
		OutputStreamWriter os=new OutputStreamWriter(fo,"euc-kr");
		buffer=new BufferedWriter(os);
	}
	public void excelSave(String fileName) throws Exception {
		bufferOpen(fileName);
		title();
		listSize=1;
		for(BookVO bookVO:bookVOList) {
			body(bookVO);
			listSize++;
		}
		footer();
		
		buffer.flush();
		buffer.close();
	}
	public void excelSave(String fileName, String text) throws Exception {
		bufferOpen(fileName);
		title();
		listSize=1;
		for(BookVO bookVO:bookVOList) {
			if(bookVO.getB_title().contains(text.trim())) {
				body(bookVO);
				listSize++;
			}
		}
		footer();
		
		buffer.flush();
		buffer.close();
	}
	public void excelSave(String fileName, int intStartPrice, int intEndPrice) throws Exception {
		bufferOpen(fileName);
		title();
		listSize=1;
		for(BookVO bookVO:bookVOList) {
			int price=bookVO.getB_price();
			if(price>=intStartPrice && price<= intEndPrice) {
				body(bookVO);
				listSize++;
			}
		}
		footer();
		
		buffer.flush();
		buffer.close();
	}
	private void title() throws Exception {
		//ISBN,title,comp,writer....
		buffer.write("ISBN,");
		buffer.write("도서명,");
		buffer.write("출판사,");
		buffer.write("저자,");
		buffer.write("발행일,");
		buffer.write("가격,");
		buffer.newLine();//enter key입력
		buffer.flush();
	}
	private void body(BookVO bookVO) throws Exception {
		//ISBN,title,comp,writer....
				buffer.write("'"+bookVO.getB_isbn()+",");
				buffer.write(bookVO.getB_title()+",");
				buffer.write(bookVO.getB_comp()+",");
				buffer.write(bookVO.getB_writer()+",");
				buffer.write("'"+bookVO.getB_date()+",");
				buffer.write(bookVO.getB_price()+",");
				buffer.newLine();//enter key입력
				buffer.flush();
	}
	private void footer( ) throws Exception {
		//ISBN,title,comp,writer....
		int nSize=bookVOList.size();
				buffer.write("도서개수,");
				buffer.write("=COUNTA(B1..B"+listSize+"),");
				buffer.newLine();//enter key입력
				buffer.flush();
	}
}
