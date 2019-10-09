package com.biz.jack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class PlayerServiceV1 {
	List<DeckVO> myDeckList;
	List<DeckVO> pubDeckList;
	String playerName;
	
	
	public PlayerServiceV1(List<DeckVO> deckList) {
		this(deckList,"딜러");
	}


	public PlayerServiceV1(List<DeckVO> deckList, String playName) {
		super();
		// TODO Auto-generated constructor stub
		myDeckList=new ArrayList<DeckVO>();
		this.pubDeckList=deckList;
		this.playerName=playName;
	}
	public int sumValue() {
		int sumValue=0;
		for(DeckVO vo:myDeckList) {
			sumValue+=vo.getValue();
		}
		return sumValue;
	}//end
	public void hit() {
		if(playerName.equalsIgnoreCase("딜러") && sumValue() > 16) {
			System.out.println("딜러점수: "+sumValue());
			System.out.println("딜러 hit 금지!!");
		}else {
			myDeckList.add(pubDeckList.get(0));
			pubDeckList.remove(0);
		}
		System.out.println("==============================================");
		System.out.println(playerName);
		System.out.println("-----------------------------------------------");
		for(DeckVO vo:myDeckList) {
			System.out.println(vo);
		}
		System.out.println("----------------------------------------------");
		System.out.println("현재점수: "+this.sumValue());
	}
}
