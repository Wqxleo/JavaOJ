package com.hw05E;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		Integer tem;
		while (scan.hasNext()) {
			if (flag == false) {
				flag = true;
			} else if (flag == true) {
				System.out.print(" ");
			}
			if (scan.hasNextInt()) {
				int temp = scan.nextInt();
				System.out.print("int");
			} else if (scan.hasNextDouble()) {
				double temp = scan.nextDouble();
				System.out.print("double");
			} else if (scan.hasNextBoolean()) {
				boolean temp = scan.nextBoolean();
				System.out.print("boolean");
			}else if (scan.hasNext()) {
				String temp = scan.next();
				System.out.print("String");
			} 
		}
	}
}