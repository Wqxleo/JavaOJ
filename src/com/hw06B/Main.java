package com.hw06B;

/**
 * Created by wangquanxiu at 2018/10/25 10:52
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map stumap = new HashMap();
        int i;
        for(i = 0; i < n; i++){
            int no = scanner.nextInt();
            String name = scanner.next();
            int score = scanner.nextInt();
            Student tem = new Student(name, score);
            stumap.put(no, tem);
        }
        //System.out.println(stumap);
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
                    Student tem = new Student(name, score);
                    stumap.put(no, tem);
                    break;
                case "delete":
                    int num = scanner.nextInt();
                    stumap.remove(num);
                    break;
                case "set":
                    int no1 = scanner.nextInt();
                    int score1 = scanner.nextInt();
                    Student temp = (Student) stumap.get(no1);
                    temp.setScore(score1);
                    stumap.put(no1, temp);
                    break;
                default:
                    break;
            }
        }

//        Student tem = new Student("dahsgd", 89);
//        stumap.put(3,tem);

        //System.out.println(stumap);
        for (Object key:stumap.keySet()){
            System.out.println("no:"+key+" "+stumap.get(key).toString());
        }
    }


}

class Student{
    private String name;
    private int score;

    public Student(String name, int score) {

        this.name = name;
        this.score = score;
    }


    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "name:"+name+" score:"+score;
    }


}
