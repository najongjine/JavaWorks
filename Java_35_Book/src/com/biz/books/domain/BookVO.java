package com.biz.books.domain;

public class BookVO {
	private String b_isbn;
	private String b_title;
	private String b_writer;
	private String b_comp;
	private String b_trans;
	private int b_price;
	private int b_page;
	private String b_date;
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVO(String b_isbn, String b_title, String b_writer, String b_trans, int b_price, String b_date) {
		super();
		this.b_isbn = b_isbn;
		this.b_title = b_title;
		this.b_writer = b_writer;
		this.b_trans = b_trans;
		this.b_price = b_price;
		this.b_date = b_date;
	}
	public String getB_isbn() {
		return b_isbn;
	}
	public void setB_isbn(String b_isbn) {
		this.b_isbn = b_isbn;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_writer() {
		return b_writer;
	}
	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	public String getB_trans() {
		return b_trans;
	}
	public void setB_trans(String b_trans) {
		this.b_trans = b_trans;
	}
	public int getB_price() {
		return b_price;
	}
	public void setB_price(int b_price) {
		this.b_price = b_price;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public String getB_comp() {
		return b_comp;
	}
	public void setB_comp(String b_comp) {
		this.b_comp = b_comp;
	}
	public int getB_page() {
		return b_page;
	}
	public void setB_page(int b_page) {
		this.b_page = b_page;
	}
	@Override
	public String toString() {
		return "BookVO [b_isbn=" + b_isbn + ", b_title=" + b_title + ", b_writer=" + b_writer + ", b_comp=" + b_comp
				+ ", b_trans=" + b_trans + ", b_price=" + b_price + ", b_page=" + b_page + ", b_date=" + b_date + "]";
	}
	
}
