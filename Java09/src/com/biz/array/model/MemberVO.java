package com.biz.array.model;

public class MemberVO {
	public String strName;
	public String strTel;
	private int intAge;
	
	public void setIntAge(int intAge) {
		if(intAge<0) {
			System.out.println("나이는 0세 이상이어야 합니다");
			return;
		}
		if(intAge>220) {
			System.out.println("나이는 220세 이하여야 합니다");
			return;
		}
		
		this.intAge=intAge;
	}
	public int getIntAge() {
		return intAge;
	}
}
