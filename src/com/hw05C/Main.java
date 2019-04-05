package com.hw05C;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count1 = 0, count2 = 0,count3 = 0;
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) >= 65) && (str.charAt(i) <= 90)) {
				count1++;
			}else if((str.charAt(i) >= 97) && (str.charAt(i) <= 122)) {
				count2++;
			}else {
				count3++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
	}
}
