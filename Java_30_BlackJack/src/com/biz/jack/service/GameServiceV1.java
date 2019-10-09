package com.biz.jack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.utils.BlackJackUtils;

public class GameServiceV1 {
	DeckServiceV1 ds;
	List<DeckVO> deckList;
	Scanner scan;
	
	public GameServiceV1() {
		// TODO Auto-generated constructor stub
		ds=new DeckServiceV1();
		ds.makeDeck();
		deckList=ds.getDeckList();
		scan=new Scanner(System.in);
	}
	public boolean gameStart(String playerName) {
		System.out.println(BlackJackUtils.getStringLong("=", 100));
		System.out.println("Game Start!!!");
		System.out.println(BlackJackUtils.getStringLong("=", 100));
		
		PlayerServiceV1 dealer=new PlayerServiceV1(deckList);
		PlayerServiceV1 player=new PlayerServiceV1(deckList,playerName);
		
		dealer.hit();
		player.hit();
		dealer.hit();
		player.hit();
		
		while(true) {
			//if(player.sumValue()>21) break;
			System.out.println("=====================================");
			System.out.println("1.Hit 2.Stand 3.Quit");
			System.out.println("-----------------------------------------");
			System.out.print("선택>> ");
			String strM=scan.nextLine();
			int intM=Integer.valueOf(strM);
			if(intM==1) {
				dealer.hit();
				player.hit();
			}else {
				if(player.sumValue()==dealer.sumValue()) {
					System.out.println("무승부 입니다!!!");
				}else if(dealer.sumValue()>dealer.sumValue()) {
					System.out.println(playerName+"승리!!!");
				}else { System.out.println("딜러승리!!!");
				
				}
				System.out.println(BlackJackUtils.getStringLong("*", 100));
				System.out.println("딜러점수: "+dealer.sumValue());
				System.out.println(playerName+"점수: "+player.sumValue());
				if(intM==2) {
					return true;
				}else if(intM==3) return false;
			}
			if(player.sumValue()>21) {
				System.out.println("딜러승리!!!");
				return true;
			}
			if(dealer.sumValue()>21) {
				System.out.println(playerName+"승리");
				return true;
			}
			System.out.println("press any key...");
			scan.nextLine();
		}
	}
}
