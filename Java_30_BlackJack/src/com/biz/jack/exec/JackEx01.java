package com.biz.jack.exec;

import java.util.List;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.service.DeckServiceV1;
import com.biz.jack.service.GameServiceV1;
import com.biz.jack.service.PlayerServiceV1;

public class JackEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameServiceV1 gs=new GameServiceV1();
		
		while(true) {
			if(!gs.gameStart("고니")) break;
		}
		
	}

}
