package com.biz.lombok.exec;

import java.util.Scanner;

import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;

public class StudentEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReadServiceV1 sRead=new StudentReadServiceV1();
		StudentViewServiceABS sView=new StudentViewServiceV1();
		String fileName="src/com/biz/lombok/학생정보.txt";
		Scanner scan=new Scanner(System.in);
		try {
			sRead.readStudent(fileName);
			sView.setStdList(sRead.getStdList());
			System.out.println("==================================================");
			System.out.println("성적알람표");
			
			int intMenu=1;
			for(;intMenu!=0;) {
				System.out.print("1. 전체조회 2.이름조회 3.학년조회 4.학년 범위내 조회 0.종료 >> ");
				String strMenu=scan.nextLine();
				if(strMenu.equalsIgnoreCase("1")) {
					sView.view();
				}
				else if(strMenu.equalsIgnoreCase("2")) {
					System.out.print("학생 이름 입력 >>");
					String strName=scan.nextLine();
					sView.view(strName);
				}
				else if(strMenu.equalsIgnoreCase("3")) {
					System.out.print("학년 입력 >>");
					int intGrade=Integer.valueOf(scan.nextLine());
					sView.view(intGrade);
				}
				else if(strMenu.equalsIgnoreCase("4")) {
					System.out.print("최저 학년 입력 >>");
					int grGrade=Integer.valueOf(scan.nextLine());
					System.out.print("최고 학년 입력 >>");
					int lessGrade=Integer.valueOf(scan.nextLine());
					sView.view(grGrade, lessGrade);
				}
				else if(strMenu.equalsIgnoreCase("0")) {
					System.out.println("프로그램 종료!");
					break;
				}
				else {
					System.out.println("메뉴를 잘못 선택 하셨습니다!");
				}
				
			}//end for
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
