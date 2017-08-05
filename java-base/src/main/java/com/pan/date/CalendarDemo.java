package com.pan.date;


import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

/** 
 * @Package com.pan.date 
 * @ClassName: CalendarDemo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月29日 上午11:24:36 
 */
public class CalendarDemo {
	
	public static void main(String[] args) {
		System.out.println(Calendar.DAY_OF_YEAR);
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		LocalTime localTime = new LocalTime(9, 10, 56);
		
		System.out.println(localTime.toString());
		DateTime dt = new DateTime(1990,11,20,12,30, 20, 0);
		LocalDate date = dt.toLocalDate();
		LocalTime time = dt.toLocalTime();
		DateTime newDt = dt.toDateTime();
		System.out.println(date.toString());
		System.out.println(time.toString());
		System.out.println(newDt.toString());
		DateTime dateTime2 = new DateTime().withDate(1985, 11, 24).withTime(12, 12, 00, 00);
		System.out.println(dateTime2.toString());
		System.out.println(date.getEra());
		
		
	}
}
