package com.biz.bank.service;

import java.io.IOException;

/*
 * BankService에서 할일을 아직 모름
 * blank interface를 만들고 실지 class 만들면서 interface를 정의.
 * 
 * 1.잔고원장으로부터 계좌들의 잔고 리스트를 가져와서 리스트로 생성.
 * 2.각 계좌벼ㅛㄹ로 입출금을 수행.
 * 3.다시 잔고원장에 입출금 내역을 반영
 * 4.각 계좌별로 입출금 내역을 파일로 저장
 */
public interface BankService {
	/*
	 * method prototype 정의
	 */
	public void readBook(String bookFile) throws Exception;
	public void viewACC()throws Exception;
	public void input()throws Exception;
	public void output()throws Exception;
	public void bookWrite(String bookFile)throws Exception;
	public void accListWrite(String remark,int money) throws Exception;
	public void bookList();
}
