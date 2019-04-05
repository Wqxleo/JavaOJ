package com.hw05G;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String d1 = scan.next();
		String d2 = scan.next();
		
		SimpleDateFormat formats = new SimpleDateFormat("MM,dd,yy");//日期提取
		Date date1 = null;
		
		try {
			date1 = formats.parse(d1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date2 = null;
		try {
			date2 = formats.parse(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//比较大小
		if (date1.before(date2)) {
			System.out.println("<");
		} else if (date1.after(date2)) {
			System.out.println(">");
		} else {
			System.out.println("=");
		}
			
		
		int distance = (int) (Math.abs((int) 
				((date1.getTime() - date2.getTime()) / (1000 * 3600 * 24))));
		//毫秒到天数
		System.out.println(distance);
		scan.close();

	}
}
