package com.biz.iolist.domain;
/*
 * 마진(사입) 붙이기
 */
public class BuyVO {
	//상품을 매입할때 사용할 domain class
	private String date;
	private String proName;
	private int price;
	private int vat;
	private int qty;
	private int total;
	
	public BuyVO(String date, String proName, int price, int vat, int qty, int total) {
		super();
		this.date = date;
		this.proName = proName;
		this.price = price;
		this.vat = vat;
		this.qty = qty;
		this.total = total;
	}
	public BuyVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "BuyVO [date=" + date + ", proName=" + proName + ", price=" + price + ", vat=" + vat + ", qty=" + qty
				+ ", total=" + total + "]";
	}
	
	
}
