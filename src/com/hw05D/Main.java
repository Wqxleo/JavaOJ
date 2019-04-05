package com.hw05D;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String str = in.nextLine();
         String [] temp = str.split(";");
         
         for(int i = 0;i < temp.length; i++) {
        	 String []ss = temp[i].split(",");
        	 for(int j = 0; j < ss.length; j++) {
        		 if(j != 0) {
        			 System.out.print(" ");
        		 }
        		 System.out.print("d["+i+","+j+"] = "+ss[j] );
        	 }
        	 System.out.println();
         }
    }    
}
