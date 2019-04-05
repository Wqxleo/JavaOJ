package com.hw05A;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int strs = in.nextInt();
		int flag = 1;
		
		String str = (strs+"").toString();
		System.out.println(str.length());
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				
				flag = 0;
			}
		}
		if(flag == 1) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
	}
}
