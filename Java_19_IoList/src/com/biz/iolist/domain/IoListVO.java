package com.biz.iolist.domain;
/*
 * 거래일자 상품명 구분 단가 수량
 * 
 * 거래일자 상품명 구분 수량 매입단가 매출단가 매입금액 매출금액
 */
public class IoListVO {
	private String strDate;
	private String strPName;
	private String strIO;
	private int intPrice;
	private int intQty;
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrPName() {
		return strPName;
	}
	public void setStrPName(String strPName) {
		this.strPName = strPName;
	}
	public String getStrIO() {
		return strIO;
	}
	public void setStrIO(String strIO) {
		this.strIO = strIO;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntQty() {
		return intQty;
	}
	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}
	@Override
	public String toString() {
		return "IoListVO [strDate=" + strDate + ", strPName=" + strPName + ", strIO=" + strIO + ", intPrice=" + intPrice
				+ ", intQty=" + intQty + "]";
	}
	
}
