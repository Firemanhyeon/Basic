package com.yedam.insa;

import java.util.Calendar;

public class CalendarEx {
	static int year;
	static int month;
static void set() {
	CalendarEx.year=year;
	CalendarEx.month = month-1;//연도와 월 정해짐
}
static void cal() {
	//해당되는 연 월의 말일 계산 , 첫날의 위치 지정
	Calendar cal = Calendar.getInstance();
	cal.set(CalendarEx.year, CalendarEx.month,1);
	
	int firstDate = cal.get(Calendar.DAY_OF_WEEK)-1;
	int lastDate = cal.getActualMaximum(Calendar.DATE);
	
	String title = "==="+ year + " 년 " + (month+1) + "월 달력";
}
}