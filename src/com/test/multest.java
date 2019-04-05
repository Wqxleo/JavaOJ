package com.test;

/**
 * Created by wangquanxiu at 2019/1/14 9:52
 */
public class multest {
    public static void main(String []args){
        int i,j;
        for(i = 1; i < 10; i++){
            for(j = 1; j <= i; j++){
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }
            System.out.println();
        }
    }
}
