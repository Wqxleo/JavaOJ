package com.wqxiu;

/**
 * Created by wangquanxiu at 2018/9/25 15:26
 */
public class Rectangle {
    protected double length;
    protected double wide;
    public Rectangle(double length, double wide){
        this.length = length;
        this.wide = wide;
    }
    public double getPerimeter(){
        return 2*(this.wide+this.length);
    }
    public double getArea(){
        return this.length*this.wide;
    }
}
