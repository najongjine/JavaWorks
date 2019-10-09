package com.biz.bank.exec;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImpV1;

public class BankEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bs=new BankServiceImpV1();
		String bookFile="src/com/biz/bank/활빈당은행잔고원장";
		
		try {
			bs.readBook(bookFile);
			bs.viewACC();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
