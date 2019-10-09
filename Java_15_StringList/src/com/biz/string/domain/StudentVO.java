package com.biz.string.domain;
/*
 * VO 클래스들의 package 이름:= model, domain, command
 * Dto(Data Transfer Object):= VO와 쓰임새가 비슷. VO와 혼용해서 사용하는 경우도 있음.
 */
public class StudentVO {
	String strNum;
	String strName;
	String strAddr;
	String strTel;
	int intAge;
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentVO(String strNum, String strName, String strAddr, String strTel, int intAge) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.intAge = intAge;
	}

	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public int getIntAge() {
		return intAge;
	}
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}
	
}
