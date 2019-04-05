package com.wqxiu;

/**
 * Created by wangquanxiu at 2018/9/19 22:01
 */
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