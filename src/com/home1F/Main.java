package com.home1F;

import java.util.Scanner;

/**
 * Created by wangquanxiu at 2018/11/7 19:43
 */
public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        for(int i = 0; i < len; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("Yes");

    }
}
