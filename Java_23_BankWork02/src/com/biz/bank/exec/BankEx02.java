package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImpV1;

public class BankEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bs=new BankServiceImpV1();
		Scanner scanner=new Scanner(System.in);
		String bookFile="src/com/biz/bank/활빈당은행잔고원장";
		
		try {
			while(true) {
				bs.readBook(bookFile);//무결성을 위한 반복적 읽기
			System.out.println("===============================");
			System.out.println("활빈당 종합 은행 V1");
			System.out.println("==================================");
			System.out.println("1.원장 리스트 2.계좌조회 3.입금 4.출금 0.종료");
			System.out.println("-------------------------------------------------");
			String strMenu=scanner.nextLine();
			int intMenu=Integer.valueOf(strMenu);
			if(intMenu==0)break;
			else if(intMenu==1) {
				bs.bookList();
			}
			else if(intMenu==2) {
				bs.viewACC();
			}
			else if(intMenu==3) {
				bs.input();
			}
			else if(intMenu==4) {
				bs.output();
			}
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
