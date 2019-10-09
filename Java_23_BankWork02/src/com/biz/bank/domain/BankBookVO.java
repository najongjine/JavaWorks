package com.biz.bank.domain;
/*
 * 데이터 관리를위한 VO
 */
public class BankBookVO {
	private String num;
	private int balance;
	private String lastDate;
	private String remark;
	public BankBookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankBookVO(String num, int balance, String lastDate, String remark) {
		super();
		this.num = num;
		this.balance = balance;
		this.lastDate = lastDate;
		this.remark = remark;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "BankBookVO [num=" + num + ", balance=" + balance + ", lastDate=" + lastDate + ", remark=" + remark
				+ "]";
	}
	
}
