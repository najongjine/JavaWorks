package com.biz.iolist.service;
/*
 * 매입매출정보.txt 로부터 매입매출 정보 읽어오기.
 * 구분에 따라 매입인지 매출인지 구분하여 매입금액, 매출금액 계산하기.
 * 리스트 출력
 */
public interface IoListService {
	public void read(String fileName) throws Exception;
	public void list();
	public void summary();
}
