package com.home2C;

import java.util.Scanner;

/**
 * Created by wangquanxiu at 2018/11/7 20:15
 */
public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Student []students = new Student[3];
        int i, j;
        for (i = 0; i < 3; i++){
            int no = scanner.nextInt();
            String name = scanner.next();
            int score = scanner.nextInt();
            students[i] = new Student(no, name, score);
        }
        Student tem = null;
        for(i = 1; i < 3; i++){
            for (j = 0; j < 3-i; j++){
                if(students[j].getScore() > students[j+1].getScore()){

                }
            }
        }
    }
}

class Student {
    private int no;
    private String name;
    private int score;

    public Student(int _no, String _name, int _score) {
        no = _no;
        name = _name;
        score = _score;
    }
    public int getNo() {return no;}
    public String getName() {return name;}
    public int getScore() {return score;}

    public void print(){
        System.out.println(no + " "+name+" "+score);
    }
}
