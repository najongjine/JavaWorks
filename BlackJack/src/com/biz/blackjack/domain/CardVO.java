package com.biz.blackjack.domain;

public class CardVO {
	private String name="";
	private int value=0, value2=0;
	
	public CardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardVO(String name, int value) {
		super();
		this.name = name;
		this.value = value;
		if(name.contains("Ace")) {
			this.value2=1;
		}
	}
	@Override
	public String toString() {
		return "CardsVO [name=" + name + ", value=" + value + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
	
}
