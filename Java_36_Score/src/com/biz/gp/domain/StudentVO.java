package com.biz.gp.domain;

public class StudentVO {
	/*
	 * 정보 은익과 캡슐화를 하고나면 많은 데이터를 VO를 통해서 처리를 하려면
	 * 객체를 생성하고 getter()를 이용해서 필드 변수에 값을 입력하는 일을 수행함.
	 * 이 방식이 상당히 번거롭게 작용하는 경우가 있다.
	 * 
	 * 불편함을 줄이기위해 생성자에 값을 주입하고 객체를 생성하는 방법을 사용함.
	 */
	private String st_num;
	private String st_name;
	private String st_tel;
	private String st_addr;
	private int st_grade;
	private String st_dept;
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(String st_num, String st_name, String st_tel, String st_addr, int st_grade, String st_dept) {
		super();
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_tel = st_tel;
		this.st_addr = st_addr;
		this.st_grade = st_grade;
		this.st_dept = st_dept;
	}
	public String getSt_num() {
		return st_num;
	}
	public void setSt_num(String st_num) {
		this.st_num = st_num;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_tel() {
		return st_tel;
	}
	public void setSt_tel(String st_tel) {
		this.st_tel = st_tel;
	}
	public String getSt_addr() {
		return st_addr;
	}
	public void setSt_addr(String st_addr) {
		this.st_addr = st_addr;
	}
	public int getSt_grade() {
		return st_grade;
	}
	public void setSt_grade(int st_grade) {
		this.st_grade = st_grade;
	}
	public String getSt_dept() {
		return st_dept;
	}
	public void setSt_dept(String st_dept) {
		this.st_dept = st_dept;
	}
	
}
