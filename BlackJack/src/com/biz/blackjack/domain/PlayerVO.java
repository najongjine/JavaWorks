package com.biz.blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class PlayerVO {
	private String name="";
	private int cardSet1=0, cardSet2=0, cardSet3=0, cardSet4=0;
	private boolean bBlackJack=false;
	private boolean bBust=false;
	private boolean bPush=false;
	private List<CardVO> cardList1=null;
	private List<CardVO> cardList2=null;
	private List<CardVO> cardList3=null;
	private List<CardVO> cardList4=null;
	
	public PlayerVO() {
		super();
		// TODO Auto-generated constructor stub
		cardList1=new ArrayList<CardVO>();
		cardList2=new ArrayList<CardVO>();
		cardList3=new ArrayList<CardVO>();
		cardList4=new ArrayList<CardVO>();
	}
	public PlayerVO(String name, List<CardVO> cardList1, List<CardVO> cardList2, List<CardVO> cardList3,
			List<CardVO> cardList4) {
		super();
		this.name = name;
		this.cardList1 = cardList1;
		this.cardList2 = cardList2;
		this.cardList3 = cardList3;
		this.cardList4 = cardList4;
	}
	@Override
	public String toString() {
		return "PlayerVO [name=" + name + ", cardList1=" + cardList1 + ", cardList2=" + cardList2 + ", cardList3="
				+ cardList3 + ", cardList4=" + cardList4 + "]";
	}
	
	public boolean isbPush() {
		return bPush;
	}
	public void setbPush(boolean bPush) {
		this.bPush = bPush;
	}
	public boolean isbBlackJack() {
		return bBlackJack;
	}
	public void setbBlackJack(boolean bBlackJack) {
		this.bBlackJack = bBlackJack;
	}
	public boolean isbBust() {
		return bBust;
	}
	public void setbBust(boolean bBust) {
		this.bBust = bBust;
	}
	public int getCardSet1() {
		return cardSet1;
	}
	public void setCardSet1(int cardSet1) {
		this.cardSet1 = cardSet1;
	}
	public int getCardSet2() {
		return cardSet2;
	}
	public void setCardSet2(int cardSet2) {
		this.cardSet2 = cardSet2;
	}
	public int getCardSet3() {
		return cardSet3;
	}
	public void setCardSet3(int cardSet3) {
		this.cardSet3 = cardSet3;
	}
	public int getCardSet4() {
		return cardSet4;
	}
	public void setCardSet4(int cardSet4) {
		this.cardSet4 = cardSet4;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CardVO> getCardList1() {
		return cardList1;
	}
	public void setCardList1(CardVO vo) {
		this.cardList1.add(vo);
	}
	public List<CardVO> getCardList2() {
		return cardList2;
	}
	public void setCardList2(CardVO vo) {
		this.cardList2.add(vo);
	}
	public List<CardVO> getCardList3() {
		return cardList3;
	}
	public void setCardList3(CardVO vo) {
		this.cardList3.add(vo);
	}
	public List<CardVO> getCardList4() {
		return cardList4;
	}
	public void setCardList4(CardVO vo) {
		this.cardList4.add(vo);
	}
	
}
