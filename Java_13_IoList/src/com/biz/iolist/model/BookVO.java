package com.biz.iolist.model;
/*
 * 클래스를 작성할때 다른 클래스를 extends하지 않으면
 * 모든 클래스는 Object 클래스를 자동으로 상속 받는다.
 * Object에는 클래스를 객체로 생성하거나 하는 몇가지 method가 설정되어 있는데
 * 그 method드을 자동으로 상속받아서 사용할수 있다.
 */
public class BookVO {
	private String strTitle;
	private String strAuthor;
	private String strPubDept;
	private int intPrice;
	private int intPubYear;
	
	public BookVO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getStrAuthor() {
		return strAuthor;
	}
	public void setStrAuthor(String strAuthor) {
		this.strAuthor = strAuthor;
	}
	public String getStrPubDept() {
		return strPubDept;
	}
	public void setStrPubDept(String strPubDept) {
		this.strPubDept = strPubDept;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntPubYear() {
		return intPubYear;
	}
	public void setIntPubYear(int intPubYear) {
		this.intPubYear = intPubYear;
	}
	
}
