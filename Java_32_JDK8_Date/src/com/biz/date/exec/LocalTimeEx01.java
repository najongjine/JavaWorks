package com.biz.date.exec;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate=LocalDate.now();
		DateTimeFormatter dDate=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String curDate=dDate.format(localDate);
		System.out.println("오늘날짜: "+curDate);
		
		LocalTime localTime=LocalTime.now();
		DateTimeFormatter fTime=DateTimeFormatter.ofPattern("hh:mm:ss");
		String curTime=fTime.format(localTime);
		System.out.println(curTime);
		
		DateTimeFormatter f24Time=DateTimeFormatter.ofPattern("HH:mm:ss");
		curTime=f24Time.format(localTime);
		System.out.println(curTime);
	}

}
