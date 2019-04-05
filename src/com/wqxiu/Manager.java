package com.wqxiu;

/**
 * Created by wangquanxiu at 2018/9/29 11:52
 */
public class Manager extends Employee {
    public Manager(double baseSalary) {
        super(baseSalary);
    }
    public void getSalary(){
        System.out.println(this.basesalary);
    }
}

