package com.home3B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// int man_salary,sal_salary,wor_salary;
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		
		int w1 = scan.nextInt();
		int w2 = scan.nextInt();
		Employee manager = new Manager(m);
		Employee salesman = new Salesman(s1, s2);
		Employee worker = new Worker(w1, w2);
		manager.getSalary();
		salesman.getSalary();
		worker.getSalary();
	}

}

abstract class Employee {
	int salary;

	public Employee(int salary) {
		this.salary = salary;
	}

	abstract public void getSalary();
}

class Manager extends Employee {

	int salary;

	public Manager(int salary) {
		super(salary);
		this.salary = salary;
	}

	public void getSalary() {
		System.out.println(this.salary);
	}
}

class Salesman extends Employee {

	int ext;

	public Salesman(int salary, int ext) {
		super(salary);
		this.ext = ext;
	}

	public void getSalary() {
		System.out.println(this.salary + this.ext);
	}
}

class Worker extends Employee {

	int day;
	int per_salary;

	public Worker(int day, int salary) {
		super(salary);
		this.day = day;
		this.per_salary = salary;
	}

	public void getSalary() {
		System.out.println(day * salary);
	}
}