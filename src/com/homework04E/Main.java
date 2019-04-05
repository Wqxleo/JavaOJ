package com.homework04E;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a[] = new int[k];
		int b[] = new int[k];
		for (int i = 0; i < k; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(b);
		int q = 0, r = 0, p = 0;
		for (int i = 0; i < k; i++) {
			if (a[i] > b[i]) {
				q++;
			}
			else if (a[i] == b[i]) {
				r++;
			}
			else {
				p++;
			}
		}
		System.out.println(""+q+'\n'+r+'\n'+p);
	}

}