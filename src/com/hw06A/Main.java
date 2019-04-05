package com.hw06A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wangquanxiu at 2018/10/25 9:26
 */
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Student> studentList = new ArrayList<>();
        int i;
        for (i = 0; i < n; i++){
            int no = scanner.nextInt();
            String name = scanner.next();
            int score = scanner.nextInt();
            studentList.add(new Student(no, name, score));
        }

        int m = scanner.nextInt();
        int j;
        for(i = 0; i < m; i++){
            String handle = scanner.next();
           // System.out.println(handle);
            switch (handle){
                case "add":
                    int no = scanner.nextInt();
                    String name = scanner.next();
                    int score = scanner.nextInt();
                    studentList.add(new Student(no, name, score));
                    break;
                case "delete":
                    int num = scanner.nextInt();
                    for(j = 0; j < studentList.size(); j++){
                        if(studentList.get(j).getNo() == num){
                            studentList.remove(j);
                            break;
                        }
                    }
                    break;
                case "set":
                    int no1 = scanner.nextInt();
                    int score1 = scanner.nextInt();
                    for(j = 0; j < studentList.size(); j++){
                        if(studentList.get(j).getNo() == no1){
                            Student tem = studentList.get(j);
                            tem.setScore(score1);

                            studentList.set(j, tem);
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        for (i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i).toString());
        }
    }
}
class Student{
    private int no;
    private String name;
    private int score;

    public Student(int no, String name, int score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    public int getNo() {
        return no;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "no:"+no+" name:"+name+" score:"+score;
    }

    public boolean equals(Student student){
        if (no == student.no){
            return true;
        }
        else {
            return false;
        }
    }
}
