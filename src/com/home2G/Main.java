package com.home2G;

/**
 * Created by wangquanxiu at 2018/11/7 20:43
 */
public class Main {
    public static void main(String []args){

    }
}
class Rectangle{
    private double longth;
    private double wide;
    public Rectangle(double longth, double wide) {
        this.longth = longth;
        this.wide = wide;
    }
    public double getPerimeter(){
        return 2*(longth+wide);
    }
    public double getArea(){
        return longth*wide;
    }

}
class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double longth, double wide, double height) {
        super(longth, wide);
        this.height = height;
    }
    
}
