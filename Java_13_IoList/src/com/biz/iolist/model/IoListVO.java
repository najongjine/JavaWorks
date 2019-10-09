package com.biz.iolist.model;

public class IoListVO {
	//맴버변수==필드==속성==property
	private String strTradedDate;
	private String strTradedTime;
	private String strProductName;
	private int intPerPrice;
	private int intQuantity;
	private int intTotalProductPrice;
	
	public String getStrTradedDate() {
		return strTradedDate;
	}
	public void setStrTradedDate(String strTradedDate) {
		this.strTradedDate = strTradedDate;
	}
	public String getStrTradedTime() {
		return strTradedTime;
	}
	public void setStrTradedTime(String strTradedTime) {
		this.strTradedTime = strTradedTime;
	}
	public String getStrProductName() {
		return strProductName;
	}
	public void setStrProductName(String strProductName) {
		this.strProductName = strProductName;
	}
	public int getintPerPrice() {
		return intPerPrice;
	}
	public void setintPerPrice(int intPerPrice) {
		this.intPerPrice = intPerPrice;
	}
	public int getIntQuantity() {
		return intQuantity;
	}
	public void setIntQuantity(int intQuantity) {
		this.intQuantity = intQuantity;
	}
	public int getIntTotalProductPrice() {
		return intTotalProductPrice;
	}
	public void setIntTotalProductPrice(int intTotalProductPrice) {
		this.intTotalProductPrice = intTotalProductPrice;
	}//end
	
	
}
