package com.biz.blackjack;

import com.biz.blackjack.service.BlackJackImp;

public class TestEx01 {

	public static void main(String[] args) {
		BlackJackImp bj=new BlackJackImp();
		bj.participate("Jong");
		//bj.forceSet(BlackJackImp.getPlayerList().get(0));
		bj.hit(BlackJackImp.getPlayerList().get(0), 2);
		bj.hit(BlackJackImp.getPlayerList().get(0), 1);
		bj.hit(BlackJackImp.getPlayerList().get(0), 1);
		System.out.println(bj.toString(0));
		System.out.println(BlackJackImp.getPlayerList().get(0).getCardSet1());
		
	}

}
