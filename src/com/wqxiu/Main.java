package com.wqxiu;

import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = scan.nextDouble();
        double wide = scan.nextDouble();
        Rectangle r = new Rectangle(length,wide);
        System.out.printf("%.2f ",r.getPerimeter());
        System.out.printf("%.2f",r.getArea());
        System.out.println();
        length = scan.nextDouble();
        wide = scan.nextDouble();
        double height = scan.nextDouble();
        Cuboid  c = new Cuboid (length, wide, height);
        System.out.printf("%.2f ",c.getPerimeter());
        System.out.printf("%.2f ",c.getArea());
        System.out.printf("%.2f",c.getVolume());

        scan.close();
    }
}