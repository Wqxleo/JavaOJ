package com.hw05F;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int month = in.nextInt();
		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DATE, 1);// 把日期设置为当月第一天  
		int MaxDAy = calendar.getActualMaximum(Calendar.DATE);

		SimpleDateFormat formats = new SimpleDateFormat("yyyy-MM-dd");
		
//		for (int i = 0; i < MaxDAy; i++) {
//			if (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7)
//				System.out.println(formats.format(calendar.getTime()));
//			calendar.add(Calendar.DATE, 1);
//		}
		for (int i = 0; i < MaxDAy; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7) {
                String str = formats.format(calendar.getTime());
                System.out.println(str);
            }
            calendar.add(Calendar.DATE, 1);
        }
	}
}

