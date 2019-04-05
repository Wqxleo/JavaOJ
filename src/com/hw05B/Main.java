package com.hw05B;

import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String chh = in.nextLine();
		char ch = chh.charAt(0);
		String st = in.nextLine();
		
		//1.ch在s中出现的次数
		int count = 0;
		for(char c : str.toCharArray()) {
			if(c == ch) {
				count ++;
			}
		}
		System.out.println(count);
		
		//2.str的逆
		System.out.println(new StringBuilder(str).reverse());
		
		//3.str在s中的所有位置
		int index = 0;
		int flag = 0;
		for(int i = 0; i < str.length(); i++) {
			index = str.indexOf(st,i);
			if(index != -1) {
				i = index + st.length()-1;
				if(flag == 0) {
					System.out.print(index);
				}else if(flag !=0) {
					System.out.print(" "+index);
				}
				flag ++;
			}
			
			
		}
		System.out.println();

		//4.所有单词首字母大写后的字符串
		char []res = str.toCharArray();
		for(int i = 0; i < res.length-1; i++) {
			if(res[i] == ' '&&res[i+1] > 96) {
				res[i+1] -= 32;
			}
		}
		if(res[0] > 96) {
			res[0] -= 32;
		}
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}
}