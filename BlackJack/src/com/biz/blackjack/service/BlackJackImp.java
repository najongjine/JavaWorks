package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.domain.CardVO;
import com.biz.blackjack.domain.PlayerVO;

public class BlackJackImp implements BlackJackService {
	private static List<CardVO> cardList=null;
	private static List<PlayerVO> playerList=null;
	
	public static List<PlayerVO> getPlayerList() {
		return playerList;
	}

	public static void setPlayerList(List<PlayerVO> playerList) {
		BlackJackImp.playerList = playerList;
	}

	public List<CardVO> getCards() {
		return cardList;
	}

	public void setCards(List<CardVO> cardList) {
		this.cardList = cardList;
	}

	public BlackJackImp(List<CardVO> cardList) {
		super();
		this.cardList = cardList;
	}

	public BlackJackImp() {//init
		super();
		cardList=new ArrayList<CardVO>();
		playerList=new ArrayList<PlayerVO>();
		// TODO Auto-generated constructor stub
		CardVO vo=new CardVO("Spade1", 1);
		cardList.add(vo);
		vo=new CardVO("Spade2", 2);
		cardList.add(vo);
		vo=new CardVO("Spade3", 3);
		cardList.add(vo);
		vo=new CardVO("Spade4", 4);
		cardList.add(vo);
		vo=new CardVO("Spade5", 5);
		cardList.add(vo);
		vo=new CardVO("Spade6", 6);
		cardList.add(vo);
		vo=new CardVO("Spade7", 7);
		cardList.add(vo);
		vo=new CardVO("Spade8", 8);
		cardList.add(vo);
		vo=new CardVO("Spade9", 9);
		cardList.add(vo);
		vo=new CardVO("Spade10", 10);
		cardList.add(vo);
		vo=new CardVO("SpadeJack",10);
		cardList.add(vo);
		vo=new CardVO("SpadeQueen", 10);
		cardList.add(vo);
		vo=new CardVO("SpadeKing", 10);
		cardList.add(vo);
		vo=new CardVO("SpadeAce", 11);
		cardList.add(vo);
		
		vo=new CardVO("Clover1", 1);
		cardList.add(vo);
		vo=new CardVO("Clover2", 2);
		cardList.add(vo);
		vo=new CardVO("Clover3", 3);
		cardList.add(vo);
		vo=new CardVO("Clover4", 4);
		cardList.add(vo);
		vo=new CardVO("Clover5", 5);
		cardList.add(vo);
		vo=new CardVO("Clover6", 6);
		cardList.add(vo);
		vo=new CardVO("Clover7", 7);
		cardList.add(vo);
		vo=new CardVO("Clover8", 8);
		cardList.add(vo);
		vo=new CardVO("Clover9", 9);
		cardList.add(vo);
		vo=new CardVO("Clover10", 10);
		cardList.add(vo);
		vo=new CardVO("CloverJack", 10);
		cardList.add(vo);
		vo=new CardVO("CloverQueen", 10);
		cardList.add(vo);
		vo=new CardVO("CloverKing", 10);
		cardList.add(vo);
		vo=new CardVO("CloverAce", 11);
		cardList.add(vo);
		
		vo=new CardVO("Heart1", 1);
		cardList.add(vo);
		vo=new CardVO("Heart2", 2);
		cardList.add(vo);
		vo=new CardVO("Heart3", 3);
		cardList.add(vo);
		vo=new CardVO("Heart4", 4);
		cardList.add(vo);
		vo=new CardVO("Heart5", 5);
		cardList.add(vo);
		vo=new CardVO("Heart6", 6);
		cardList.add(vo);
		vo=new CardVO("Heart7", 7);
		cardList.add(vo);
		vo=new CardVO("Heart8", 8);
		cardList.add(vo);
		vo=new CardVO("Heart9", 9);
		cardList.add(vo);
		vo=new CardVO("Heart10", 10);
		cardList.add(vo);
		vo=new CardVO("HeartJack", 10);
		cardList.add(vo);
		vo=new CardVO("HeartQueen", 10);
		cardList.add(vo);
		vo=new CardVO("HeartKing", 10);
		cardList.add(vo);
		vo=new CardVO("HeartAce", 11);
		cardList.add(vo);
		
		vo=new CardVO("Dia1", 1);
		cardList.add(vo);
		vo=new CardVO("Dia2", 2);
		cardList.add(vo);
		vo=new CardVO("Dia3", 3);
		cardList.add(vo);
		vo=new CardVO("Dia4", 4);
		cardList.add(vo);
		vo=new CardVO("Dia5", 5);
		cardList.add(vo);
		vo=new CardVO("Dia6", 6);
		cardList.add(vo);
		vo=new CardVO("Dia7", 7);
		cardList.add(vo);
		vo=new CardVO("Dia8", 8);
		cardList.add(vo);
		vo=new CardVO("Dia9", 9);
		cardList.add(vo);
		vo=new CardVO("Dia10", 10);
		cardList.add(vo);
		vo=new CardVO("DiaJack", 10);
		cardList.add(vo);
		vo=new CardVO("DiaQueen", 10);
		cardList.add(vo);
		vo=new CardVO("DiaKing", 10);
		cardList.add(vo);
		vo=new CardVO("DiaAce", 11);
		cardList.add(vo);
		
		Collections.shuffle(cardList);
		
	}
	public void participate(String name) {
		int index=cardList.size()-1;
		PlayerVO vo=new PlayerVO();
		vo.setName(name);
		if(index>1) {
			
			vo.setCardList1(cardList.get(index));
			cardList.remove(index--);
			vo.setCardList1(cardList.get(index));
			cardList.remove(index--);
		}
		System.out.println(vo.toString());
		playerList.add(vo);
		calculate(vo);
	}
	@Override
	public void calculate(PlayerVO vo) {
		int[] caseOfAce=new int[4];
		int _value1=0;
		for(int i:caseOfAce) {
			caseOfAce[i]=0;
		}
		int index=0;
		
		if(vo.getCardList1()==null) {
			System.out.println("플레이어 %s는 아직 아무 카드도 가지고 있지 않습니다");
			return;
		}
		List<Integer> aceIndex1=new ArrayList<Integer>();
		for(CardVO _vo:vo.getCardList1()) {//Ace가 있는 카드index 뽑음
			if(_vo.getName().contains("Ace")) {
				aceIndex1.add(index);
			}
			index++;
		}
		index=0;
		
		int aceIndexSize1=aceIndex1.size();
		for(int i=0;i<vo.getCardList1().size();i++) {//Ace카드는 일단 제외하고 점수 계산
			if(vo.getCardList1().get(i).getName().contains("Ace")) continue;

			_value1+=vo.getCardList1().get(i).getValue();
		}

		caseOfAce[0]=_value1;
		for(int i:aceIndex1) {//Ace 카드 포함시켜서 점수 계산
			if(caseOfAce[0]+vo.getCardList1().get(i).getValue()+(--aceIndexSize1)<=21) {
				caseOfAce[0]+=vo.getCardList1().get(i).getValue();
			}
			else  {
				caseOfAce[0]+=vo.getCardList1().get(i).getValue2();
			}

		}
		vo.setCardSet1(caseOfAce[0]);//1번 카드셋 점수 계산 끝
		

		List<Integer> aceIndex2=new ArrayList<Integer>();
		for(CardVO _vo:vo.getCardList2()) {//Ace가 있는 카드index 뽑음
			if(_vo.getName().contains("Ace")) {
				aceIndex2.add(index);
			}
			index++;
		}
		index=0;
		
		int aceIndexSize2=aceIndex2.size();
		for(int i=0;i<vo.getCardList2().size();i++) {//Ace카드는 일단 제외하고 점수 계산
			if(vo.getCardList2().get(i).getName().contains("Ace")) continue;

			_value1+=vo.getCardList2().get(i).getValue();
		}

		caseOfAce[0]=_value1;
		for(int i:aceIndex2) {//Ace 카드 포함시켜서 점수 계산
			if(caseOfAce[0]+vo.getCardList2().get(i).getValue()+(--aceIndexSize2)<=21) {
				caseOfAce[0]+=vo.getCardList2().get(i).getValue();
			}
			else  {
				caseOfAce[0]+=vo.getCardList2().get(i).getValue2();
			}
			
		}
		vo.setCardSet2(caseOfAce[0]); //2번 카드셋 계산 끝
		
		List<Integer> aceIndex3=new ArrayList<Integer>();
		for(CardVO _vo:vo.getCardList3()) {//Ace가 있는 카드index 뽑음
			if(_vo.getName().contains("Ace")) {
				aceIndex3.add(index);
			}
			index++;
		}
		index=0;
		
		int aceIndexSize3=aceIndex3.size();
		for(int i=0;i<vo.getCardList3().size();i++) {//Ace카드는 일단 제외하고 점수 계산
			if(vo.getCardList3().get(i).getName().contains("Ace")) continue;

			_value1+=vo.getCardList3().get(i).getValue();
		}

		caseOfAce[0]=_value1;
		for(int i:aceIndex3) {//Ace 카드 포함시켜서 점수 계산
			if(caseOfAce[0]+vo.getCardList3().get(i).getValue()+(--aceIndexSize3)<=21) {
				caseOfAce[0]+=vo.getCardList3().get(i).getValue();
			}
			else  {
				caseOfAce[0]+=vo.getCardList3().get(i).getValue2();
			}
		}
		vo.setCardSet3(caseOfAce[0]);//3번 카드셋 점수계산 끝
		
		List<Integer> aceIndex4=new ArrayList<Integer>();
		for(CardVO _vo:vo.getCardList4()) {//Ace가 있는 카드index 뽑음
			if(_vo.getName().contains("Ace")) {
				aceIndex4.add(index);
			}
			index++;
		}
		index=0;
		
		int aceIndexSize4=aceIndex4.size();
		for(int i=0;i<vo.getCardList4().size();i++) {//Ace카드는 일단 제외하고 점수 계산
			if(vo.getCardList4().get(i).getName().contains("Ace")) continue;

			_value1+=vo.getCardList4().get(i).getValue();
		}

		caseOfAce[0]=_value1;
		caseOfAce[1]=_value1;
		for(int i:aceIndex4) {//Ace 카드 포함시켜서 점수 계산
			if(caseOfAce[0]+vo.getCardList4().get(i).getValue()+(--aceIndexSize4)<=21) {
				caseOfAce[0]+=vo.getCardList4().get(i).getValue();
			}
			else  {
				caseOfAce[0]+=vo.getCardList4().get(i).getValue2();
			}
		}
		vo.setCardSet4(caseOfAce[0]);//4번 카드셋 계산 끝*/
		
		
	}

	@Override
	public boolean CheckBlackJack(PlayerVO playerVO) {
		// TODO Auto-generated method stub
		int _value1=playerVO.getCardSet1();
		int _value2=playerVO.getCardSet2();
		int _value3=playerVO.getCardSet3();
		int _value4=playerVO.getCardSet4();
		if(_value1==21 || _value2==21 || _value3==21 || _value4==21) {
			playerVO.setbBlackJack(true);
			return true;
		}
		playerVO.setbBlackJack(false);
		return false;
	}

	@Override
	public boolean checkBust(PlayerVO playerVO) {
		// TODO Auto-generated method stub
		int _value1=playerVO.getCardSet1();
		int _value2=playerVO.getCardSet2();
		int _value3=playerVO.getCardSet3();
		int _value4=playerVO.getCardSet4();
		if(_value1>21 || _value2>21 || _value3>21 || _value4>21) {
			playerVO.setbBust(true);
			return true;
		}
		playerVO.setbBust(true);
		return true;
	}

	@Override
	public boolean checkPush(PlayerVO playerVO) {
		int dealerCardValue=0;
		int _value1=playerVO.getCardSet1();
		int _value2=playerVO.getCardSet2();
		int _value3=playerVO.getCardSet3();
		int _value4=playerVO.getCardSet4();
		if(dealerCardValue==_value1 || dealerCardValue==_value2 || dealerCardValue==_value3 ||dealerCardValue==_value4  ) {
			playerVO.setbPush(true);
		}
		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public void stay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hit(PlayerVO playerVO, int cardSet) {
		// TODO Auto-generated method stub
		int index=0;
		switch(cardSet) {
			case 1:
				index=cardList.size()-1;
				playerVO.getCardList1().add(cardList.get(index));
				cardList.remove(index);
				calculate(playerVO);
				break;
			case 2:
				//if(playerVO.getCardList2().get(0).getValue()==0) {
				if(playerVO.getCardList2().size()<=0) {
					System.out.println("아직 2번째 카드세트에 split을 사용하지 않아서 hit은 무효가 됩니다.");
					break;
				}
				index=cardList.size()-1;
				playerVO.getCardList2().add(cardList.get(index));
				cardList.remove(index);
				calculate(playerVO);
				break;
			case 3:
				if(playerVO.getCardList3().size()<=0) {
					System.out.println("아직 2번째 카드세트에 split을 사용하지 않아서 hit은 무효가 됩니다.");
					break;
				}
				index=cardList.size()-1;
				playerVO.getCardList3().add(cardList.get(index));
				cardList.remove(index);
				calculate(playerVO);
				break;
			case 4:
				if(playerVO.getCardList4().size()<=0) {
					System.out.println("아직 2번째 카드세트에 split을 사용하지 않아서 hit은 무효가 됩니다.");
					break;
				}
				index=cardList.size()-1;
				playerVO.getCardList4().add(cardList.get(index));
				cardList.remove(index);
				calculate(playerVO);
				break;
			default:
				System.out.println(cardSet+"번째 카드셋은 없습니다. 이번 Hit은 무효화 됩니다.");
				break;
		}
	}

	@Override
	public void surrender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void evenMoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doubleDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void split(PlayerVO playerVO) {
		// TODO Auto-generated method stub
		int cardLSize2=playerVO.getCardList2().size();
		int cardLSize3=playerVO.getCardList3().size();;
		int cardLSize4=playerVO.getCardList4().size();;
		if(playerVO.getCardList1().get(0).getValue()==playerVO.getCardList1().get(1).getValue()) {
			
		}
	}

	@Override
	public String toString(int index) {
		String str="";
		for(CardVO cardVO:playerList.get(index).getCardList1()) {
			str+=cardVO.getName()+","+cardVO.getValue()+": ";
		}
		return str;
	}
	
	public void forceSet(PlayerVO playerVO) {
		playerVO.getCardList1().clear();
		CardVO vo=new CardVO("SpadeAce", 11);
		cardList.add(vo);
		playerVO.getCardList1().add(vo);
		vo=new CardVO("Spade2", 3);
		cardList.add(vo);
		playerVO.getCardList1().add(vo);
		vo=new CardVO("SpadeAce", 11);
		cardList.add(vo);
		playerVO.getCardList1().add(vo);
		vo=new CardVO("Spade3", 7);
		cardList.add(vo);
		playerVO.getCardList1().add(vo);
		vo=new CardVO("SpadeAce", 11);
		cardList.add(vo);
		playerVO.getCardList1().add(vo);
	}

}
