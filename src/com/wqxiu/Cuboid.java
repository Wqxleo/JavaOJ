package com.wqxiu;

/**
 * Created by wangquanxiu at 2018/9/25 15:32
 */
public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double length, double wide, double height) {
        super(length, wide);
        this.height = height;
    }
    public double getPerimeter(){
        return 4*(this.height+this.length+this.wide);
    }

    public double getArea(){
        return 2*(this.height*this.wide+this.length*this.wide+this.height*this.length);
    }
    public double getVolume(){
        return this.length*this.height*this.wide;

    }
}
