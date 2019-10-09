package com.biz.date.exec;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime local=LocalDateTime.now();
		System.out.println("year: "+local.getYear());
		System.out.println("month: "+local.getMonth());
		System.out.println("day: "+local.getDayOfMonth());
		System.out.printf("%02d:%02d:%02d\n",local.getHour(),local.getMinute(),
				local.getSecond());
		
		System.out.println(local.plusDays(3).toString());
		System.out.println(local.plusMonths(9).toString());
		System.out.println(local.with(TemporalAdjusters.firstDayOfYear()));
		System.out.println(local.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
		
		LocalDateTime makeDateTime=LocalDateTime.now();
		makeDateTime=makeDateTime.withHour(10);
		makeDateTime=makeDateTime.withMinute(12);
		makeDateTime=makeDateTime.withSecond(22);
		System.out.println(makeDateTime.toString());
		
		LocalDateTime t=LocalDateTime.now();
		int curMonth=t.getYear();
		int p3Month=t.plusYears(2).getYear();
		System.out.printf("%d-%d=%d\n",p3Month,curMonth,p3Month-curMonth);
	}

}
