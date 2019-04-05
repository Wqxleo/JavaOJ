package com.homework4C;

/**
 * Created by wangquanxiu at 2018/11/8 10:05
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        int no = 0;
        String name = null;
        int age = 0;
        String seminary= null;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        TeacherManagement ts = new TeacherManagement(n);
        for(int i = 0;i < n;i++) {
            no = in.nextInt();
            name = in.next();
            age = in.nextInt();
            seminary = in.next();
            Teacher t = new Teacher(no,name,age,seminary);
            ts.add(t,i);
        }

        ts.sort();
        ts.print();

        String ready = in.next();
        int nu = in.nextInt();

        ts.search(ready);
        ts.search(nu);


    }
}
class Teacher implements Comparable{
    private int no;
    private String name;
    private int age;
    private String seminary;

    public Teacher(int no, String name, int age, String seminary) {
        super();
        this.no = no;
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSeminary() {
        return seminary;
    }
    public void setSeminary(String seminary) {
        this.seminary = seminary;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj instanceof Teacher) {
            Teacher temp = (Teacher)obj;
            if(this.no == temp.no) {
                return true;
            }
        }
        return false;

    }
    @Override
    public String toString() {
        String str = "no: " + no + ", name: " + name + ", age: " + age +", seminary: " + seminary;
        return str;
    }
    @Override
    public int compareTo(Object o) {
        Teacher obj = (Teacher)o;
        if(this.no > obj.no) {
            return 1;
        }else if (this.no == obj.no){
            return 0;
        }else {
            return -1;
        }
    }

}
class TeacherManagement{
    int num;
    Teacher[] teacher;
    TeacherManagement(int num) {
        this.num = num;
        teacher  = new Teacher[num];
    }
    public void add(Teacher t, int i) {
        teacher[i] = t;
    }
    public void print() {
        for (Teacher t : teacher) {
            System.out.println(t.toString());
        }
    }
    public void sort() {
        Arrays.sort(teacher);
    }
    public void search(String name) {
        int judge = 0;
        System.out.println("search by name:");
        for(int i = 0; i < num; i++) {
            if(teacher[i].getName().equals(name)) {
                judge = 1;
                System.out.println(teacher[i].toString());
            }
        }
        if(judge == 0) {
            System.out.println("no such teacher");
        }
    }
    public void search(int age) {
        int judge = 0;
        System.out.println("search by age:");
        for(int i = 0; i < num; i++) {
            if(teacher[i].getAge() == age) {
                judge = 1;
                System.out.println(teacher[i].toString());
            }
        }
        if(judge == 0) {
            System.out.println("no such teacher");
        }
    }
}