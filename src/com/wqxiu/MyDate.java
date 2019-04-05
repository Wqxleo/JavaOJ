package com.wqxiu;

import java.util.Scanner;

/**
 * Created by wangquanxiu at 2018/9/20 10:35
 */
 class MyDate {
    private int year;
    private int mouth;
    private int day;

    public MyDate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int compare(MyDate d){
        if(this.year > d.year){
            return 1;
        }
        else if(this.year < d.year) {
            return -1;
        }
        else {
            if(this.mouth > d.mouth){
                return 1;
            }
            else if (this.mouth < d.mouth){
                return -1;
            }
            else {
                if (this.day > d.day){
                    return 1;
                }
                else if(this.day < d.day){
                    return -1;
                }
                else {
                    return 0;
                }
            }

        }
    }

    public void print(){
        System.out.print(mouth+"/"+day+"/"+year+" ");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i,j;
        MyDate[] date = new MyDate[2];
        for(i = 0; i < 2; i++){
            int year = scan.nextInt();
            int mouth = scan.nextInt();
            int day = scan.nextInt();
            date[i] = new MyDate(year, mouth, day);
        }
        date[0].print();
        System.out.print(date[0].compare(date[1]));
        scan.close();
    }
}
