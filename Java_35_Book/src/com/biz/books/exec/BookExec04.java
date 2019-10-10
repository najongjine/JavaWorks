package com.biz.books.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.BookSaveServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookReadServiceV1 bRead=new BookReadServiceV1();
		BookViewServiceV1 bView=new BookViewServiceV1();
		BookSaveServiceV1 bSave=new BookSaveServiceV1();
		String bookFile="src/com/biz/books/도서정보.txt";
		String bookSavePath="src/com/biz/books/";
		Scanner scanner=new Scanner(System.in);
		int startPrice=0, endPrice=0;
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookVOList=bRead.getBookVOList();
			bView.setBookVOList(bookVOList);
			bSave.setBookVOList(bookVOList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("====================================================");
			System.out.println("도서검색");
			System.out.println("====================================================");
			System.out.println("1.제목  2.가격  0.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택>> ");
			String strM=scanner.nextLine();
			int intM=Integer.valueOf(strM);
			if(intM==0)break;
			else if(intM==1) {
				System.out.print("제목,혹은 제목에 포함된 단어를 입력해 주세요 >> ");
				String strTitle=scanner.nextLine();
				bView.search(strTitle);
				
				System.out.print("파일로 저장? (YES/no)>> ");
				String sOk=scanner.nextLine();
				if(sOk.equalsIgnoreCase("YES")) {
					try {
						bSave.print(bookSavePath+strTitle+".txt", strTitle);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else if(intM==2) {
				System.out.print("원하시는 최저 가격대를 입력해주세요 >> ");
				String strStartPrice=scanner.nextLine();
				int intStartPrice=Integer.valueOf(strStartPrice);
				System.out.print("원하시는 최대 가격대를 입력해주세요 >> ");
				String strEndPrice=scanner.nextLine();
				int intEndPrice=Integer.valueOf(strEndPrice);
				try {
					bView.search(intStartPrice,intEndPrice);
					
					System.out.print("파일로 저장? (YES/no)>> ");
					String sOk=scanner.nextLine();
					if(sOk.equalsIgnoreCase("YES")) {
						try {
							bSave.print(bookSavePath+strStartPrice+"~"+strEndPrice+".txt", intStartPrice,intEndPrice);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("가격은 숫자형식으로 입력!!");
				}
				
			}
			
		}

	}

}
