package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankBookVO;
import com.biz.bank.util.BankInfo;

public class BankServiceImpV1 implements BankService {
	Map<String,BankBookVO> bankBookList;
	BankBookVO bookVO=null;
	Scanner scanner;
	String bookFile="src/com/biz/bank/활빈당은행잔고원장";
	
	public BankServiceImpV1(Map<String, BankBookVO> bankBookList) {
		super();
		this.bankBookList = bankBookList;
	}


	public BankServiceImpV1() {
		super();
		// TODO Auto-generated constructor stub
		bankBookList=new TreeMap<String, BankBookVO>();
		scanner=new Scanner(System.in);
	}


	@Override
	public void readBook(String bookFile) throws Exception {
		//잔고원장 파일을 읽어서 리스트로 생성
		this.bookFile=bookFile;
		FileReader fr;
		BufferedReader buffer;
		fr=new FileReader(bookFile);
		buffer=new BufferedReader(fr);
		
		String reader=new String();
		while(true) {
			reader=buffer.readLine();
			if(reader==null) {
				break;
			}
			String[] books=reader.split(":"); //0=계좌번호 1=balance 2=거래일자 3=remark
			String strNum=books[BankInfo.BOOK.NUM];
			String strBalance=books[BankInfo.BOOK.BALANCE];
			String strLastDate=books[BankInfo.BOOK.LAST_DATE];
			String strRemark=books[BankInfo.BOOK.REMARK];
			int intBalance=Integer.valueOf(strBalance);
			
			BankBookVO bookVO=new BankBookVO();
			bookVO.setNum(strNum);
			bookVO.setBalance(intBalance);
			bookVO.setLastDate(strLastDate);
			bookVO.setRemark(strRemark);
			bankBookList.put(strNum, bookVO);
			
			//System.out.println(bookVO.toString());
		}
		buffer.close();
		fr.close();
	}//end


	@Override
	public void viewACC()throws Exception {
		// TODO Auto-generated method stub
		System.out.print("계좌번호 >>");
		String _strNum=scanner.nextLine();
		bookVO=bankBookList.get(_strNum);
		//bankBookList에서 추출된 bookVO를 입출금 처리 method에서 사용할수 있도록 맴버변수 영역으로 이동하기
		
		if(bookVO==null) {
			System.out.println("해당 계좌번호는 조회되지 않습니다!!");
			return;
		}
		
	}//end


	@Override
	public void input() throws Exception {
		// TODO Auto-generated method stub
		viewACC();
		if(bookVO==null) return;
		
		System.out.print("입금액 >>");
		String strInput=scanner.nextLine();
		int intInput=Integer.valueOf(strInput);
		if(intInput<0) {
			System.out.println("입금액은 0원 이상 이어야 함!!");
			return;
		}
		bookVO.setBalance(bookVO.getBalance()+intInput);
		
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String lastDate=sd.format(date);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark(BankInfo.REMARK.INPUT);
		
		accListWrite(BankInfo.REMARK.INPUT, intInput);
		bookWrite(bookFile);
	}//end


	@Override
	public void output() throws Exception{
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
		
		/*
		 * 1.8에서 새로 등장한 클래스
		 */
		LocalDate localDate=LocalDate.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String lastDate=localDate.format(df);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark(BankInfo.REMARK.OUTPUT);
		
		accListWrite(BankInfo.REMARK.OUTPUT, intOutput);
		bookWrite(bookFile);
		
	}//end


	@Override
	public void bookWrite(String bookFile) throws Exception {
		// TODO 원장정보 파일에 저장
		FileWriter fw;
		PrintWriter printWriter;
		fw=new FileWriter(bookFile);
		printWriter=new PrintWriter(fw,true);
		
		int nSize=bankBookList.size();
		Set<String> keys=bankBookList.keySet();
		for(String key:keys) {
			int i=1;
			i++;
			String strNum=bankBookList.get(key).getNum();
			int intBalance=bankBookList.get(key).getBalance();
			String strLastDate=bankBookList.get(key).getLastDate();
			String strRemark=bankBookList.get(key).getRemark();
			if(i%(nSize+1)!=0) {
				printWriter.write(String.format("%s:%d:%s:%s\n", strNum,intBalance,strLastDate,strRemark));
			}else {
				printWriter.write(String.format("%s:%d:%s:%s", strNum,intBalance,strLastDate,strRemark));
			}
			printWriter.flush();
		}
		printWriter.close();
		fw.close();
	}//end
	public void bookList() {
		System.out.println("------------------------------------");
		System.out.println("계좌\t잔액\t거래일자\t구분");
		System.out.println("-------------------------------------");
		Set<String> keys=bankBookList.keySet();
		for(String key:keys) {
			int i=1;
			String strNum=bankBookList.get(key).getNum();
			int intBalance=bankBookList.get(key).getBalance();
			String strLastDate=bankBookList.get(key).getLastDate();
			String strRemark=bankBookList.get(key).getRemark();
			System.out.printf("%s\t%d\t%s\t%s\n",strNum,intBalance,strLastDate,strRemark);
		}
		System.out.println("-------------------------------------------------------");
	}


	@Override
	public void accListWrite(String remark, int money) throws Exception {
		// TODO 거래내역 파일로 저장
		String strAccPath="src/com/biz/bank/books/";
		String accBookFile=String.format("BOOK-%s.txt", bookVO.getNum());
		FileWriter fileWriter;
		PrintWriter accBook;
		fileWriter=new FileWriter(strAccPath+accBookFile,true);
		accBook=new PrintWriter(fileWriter);
		
		int intBalance=bookVO.getBalance();
		String lastDate=bookVO.getLastDate();
		int intInput=0;
		int intOutput=0;
		intInput=money;
		if(remark.equalsIgnoreCase(BankInfo.REMARK.OUTPUT)) {
			intInput=0;
			intOutput=money;
		}
		String strWriter=String.format("%s:%s,%d,%d,%d", lastDate,remark,intInput,intOutput,intBalance);
		accBook.println(strWriter);
		accBook.flush();
		accBook.close();
		fileWriter.close();
	}
}
