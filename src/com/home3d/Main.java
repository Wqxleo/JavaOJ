package com.home3d;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);      
         double length = scan.nextDouble();
         Square s = new Square(length);
         System.out.printf("%.2f ",s.getPerimeter());
         System.out.printf("%.2f\n",s.getArea());

         length = scan.nextDouble();
         double wide = scan.nextDouble();
         Rectangle r = new Rectangle(length,wide);
         System.out.printf("%.2f ",r.getPerimeter());
         System.out.printf("%.2f\n",r.getArea());

         double radius = scan.nextDouble();
         Circle c = new Circle(radius);
         System.out.printf("%.2f ",c.getPerimeter());
         System.out.printf("%.2f\n",c.getArea());

         scan.close(); 
    }
}

abstract class Shape{
	
	public abstract  double  getPerimeter();
	public abstract  double getArea();
}

class Square extends Shape{
	
	protected double length;

	public Square(double length) {
		super();
		this.length = length;
	}
	public  double  getPerimeter() {
		return 4*length;
	}
	public  double getArea() {
		return length*length;
	}
}
class Rectangle extends Square{
	private double wide;

	public Rectangle(double length, double wide) {
		super(length);
		this.wide = wide;
	}
	public  double  getPerimeter() {
		return 2*(length+wide);
	}
	public  double getArea() {
		return wide*length;
	}
}

class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public  double  getPerimeter() {
		return 2*Math.PI*radius;
	}
	public  double getArea() {
		return Math.PI*radius*radius;
	}
	
}