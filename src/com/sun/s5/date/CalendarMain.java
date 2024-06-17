package com.sun.s5.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar ca = new GregorianCalendar();
// 현재 시간과 날짜 정보가 만들어짐
		ca = Calendar.getInstance();
		System.out.println(ca);
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH) + 1);
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		Date date = ca.getTime();
		System.out.println(date);
		Single single = Single.get();
		Calendar future = Calendar.getInstance();

		future.set(Calendar.DATE, future.get(Calendar.DATE) + 17);

		System.out.println(future.getTime());
	}

}
