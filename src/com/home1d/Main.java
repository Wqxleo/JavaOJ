package com.home1d;

import java.util.Scanner;

/**
 * Created by wangquanxiu at 2018/11/7 19:38
 */
public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int sum = 0;
        int max = 0;
        while (n > 0){
            if(n%10>max){
                max = n%10;
            }
            n = n/10;
        }
        System.out.print(max);
    }
}
