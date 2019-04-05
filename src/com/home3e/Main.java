package com.home3e;

import java.util.Scanner;

/**
 * Created by wangquanxiu at 2018/9/29 16:39
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int id1 = scanner.nextInt();
        String name1 = scanner.next();
        String sex1 = scanner.next();
        String major1 = scanner.next();
        double socor1 = scanner.nextDouble();
        ReStudent reStudent = new ReStudent(id1, name1, sex1, major1, socor1);


        int id2 = scanner.nextInt();
        String name2 = scanner.next();
        String sex2 = scanner.next();
        String major2 = scanner.next();
        String teacher = scanner.next();
        double socor2 = scanner.nextDouble();
        SStudent sStudent = new SStudent(id2, name2, sex2, major2, teacher, socor1);


    }



}

class Student{
    protected int id;
    protected String name;
    protected String sex;
    protected String major;
    protected double socor;

    public Student(int id, String name, String sex, String major, double socor) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.major = major;
        this.socor = socor;
    }

    public void getGrade(){

    }
}
class ReStudent extends Student {

    public  ReStudent(int id, String name, String sex, String major, double socor) {
        super(id, name, sex, major, socor);
    }

    public void getGrade() {
        if (this.socor < 50) {
            System.out.println('E');
        }
        else if(this.socor >= 50 && this.socor <60){
            System.out.println('D');
        }
        else if(this.socor >= 60 && this.socor < 70){
            System.out.println('C');
        }
        else if(this.socor >= 70 && this.socor < 80){
            System.out.println('B');
        }
        else if(this.socor >= 80 && this.socor < 100){
            System.out.println('A');
        }

    }
}
class SStudent extends Student {
    private String teacher;

    public SStudent(int id, String name, String sex, String major,String teacher, double socor) {
        super(id, name, sex, major, socor);
        this.teacher = teacher;
    }

    public void getGrade() {
        if (this.socor < 60) {
            System.out.println('E');
        }
        else if(this.socor >= 60 && this.socor < 70){
            System.out.println('D');
        }
        else if(this.socor >= 70 && this.socor < 80){
            System.out.println('C');
        }
        else if(this.socor >= 80 && this.socor < 90){
            System.out.println('B');
        }
        else if(this.socor >= 90 && this.socor < 100){
            System.out.println('A');
        }

    }
}
