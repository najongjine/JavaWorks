package com.biz.date.exec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateEx01 {

	public static void main(String[] args) {
		// 현재 날짜 가져오기
		/*Date date=new Date(System.currentTimeMillis());
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		String curDate=sf.format(date);
		SimpleDateFormat st=new SimpleDateFormat("hh:mm:ss");
		String curTime=st.format(date);
		
		//System.out.println("오늘: "+curDate);
		//System.out.println("시각: "+curTime);
		
		/*
		 * Date 상위버전. 하지만 문제 많음.
		 * Calendar는 생성자로 객체를 생성할수 없다.
		 */
		//1개의 프로젝트에서 공통으로 공유하는 객체.
		//객체를 만드는게 아니라 이미 생성되어있는 객체를
		//getInstance() method를 통해서 가져다 쓴다.
		Calendar calendar=Calendar.getInstance(); //싱글톤 객체
		System.out.println("연도: "+calendar.get(Calendar.YEAR));
		System.out.println("월: "+calendar.get(Calendar.MONTH));
		System.out.println("오늘: "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("시: "+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("분: "+calendar.get(Calendar.MINUTE));
		System.out.println("초: "+calendar.get(Calendar.SECOND));
		System.out.printf("%02d:%02d:%02d\n",calendar.get(Calendar.HOUR_OF_DAY),
				calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND));
		
		/*
		 * JDK 8 이상에서만 사용가능함
		 */
		LocalDate localDate=LocalDate.now();
		DateTimeFormatter dDate=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String curDate=dDate.format(localDate);
		System.out.println("오늘날짜: "+curDate);
	}

}
