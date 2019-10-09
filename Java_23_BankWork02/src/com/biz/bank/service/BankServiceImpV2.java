package com.biz.bank.service;

public class BankServiceImpV2 extends BankServiceImpV1 {
	
	public void output() throws Exception {
		// TODO Auto-generated method stub
		viewACC();
		if(bookVO==null) return;
		
		System.out.print("출금액 >>");
		String strOutput=scanner.nextLine();
		int intOutput=Integer.valueOf(strOutput);
		if(intOutput<0) {
			System.out.println("출금액은 0원 이상 이어야 함!!");
			return;
		}
		else if(intOutput>bookVO.getBalance()) {
			System.out.println("출금액이 현 잔고보다 더 큽니다!!");
			return;
		}
		bookVO.setBalance(bookVO.getBalance()-intOutput);
	}//end
}
