package com.biz.classes.model;

public class AddressVO {
	public String strName;
	public String strPhoneNum;
	public String strAddress;
	public String strRelation;
	
	public void viewAddress() {
		System.out.println("-------------"+ strName+ "의 주소정보---------------");
		System.out.println("전화번호: "+strPhoneNum);
		System.out.println("주소: "+strAddress);
		System.out.println("관계: "+strRelation);
		System.out.println("---------------------------------------------");
	}
	
}
