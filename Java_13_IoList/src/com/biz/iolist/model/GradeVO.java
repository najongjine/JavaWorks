package com.biz.iolist.model;

public class GradeVO {
	private String strNum;
	private String strName;
	private int intKor;
	
	public GradeVO(String strNum, String strName, int intKor) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.intKor = intKor;
	}
	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GradeVO(String strNum) {
		this.strNum=strNum;
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
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + "]";
	}
	
	
	
	
}
