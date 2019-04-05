package com.wqxiu;

/**
 * Created by wangquanxiu at 2018/9/25 15:14
 */
public class Circle {
    private double r;

    public Circle(){

    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getPerimeter(){
        return 2*3.14*this.r;
    }

    public double getArea(){
        return 3.14*this.r*this.r;
    }
}