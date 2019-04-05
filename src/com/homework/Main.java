package com.homework;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int no = scan.nextInt();
		String name = scan.next();
		String sex = scan.next();
		String major = scan.next();
		int score = scan.nextInt();
		CollegeStudent c = new CollegeStudent(no, name, sex, major, score);
		c.getGrade();

		no = scan.nextInt();
		name = scan.next();
		sex = scan.next();
		major = scan.next();
		String supervisor = scan.next();
		score = scan.nextInt();
		GraduateStudent g = new GraduateStudent(no, name, sex, major, supervisor, score);
		g.getGrade();
		
		scan.close();
	}
}

abstract class Student {

	protected int no;
	protected int score;
	protected String name;
	protected String sex;

	public Student(int no, String name, String sex, int score) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void attendClass(String className) {

	}

	abstract public void getGrade();

	public void print() {
		System.out.println("no: " + no);
		System.out.println("name: " + name);
		System.out.println("sex: " + sex);
	}

}

class CollegeStudent extends Student {
	protected String major;

	public CollegeStudent(int no, String name, String sex, String major, int score) {
		super(no, name, sex, score);
		this.major = major;
	}

	@Override
	public void getGrade() {
		if (score >= 80 && score < 100) {
			System.out.println("A");
		} else if (score >= 70 && score < 80) {
			System.out.println("B");
		} else if (score >= 60 && score < 70) {
			System.out.println("C");
		} else if (score >= 50 && score < 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}

}

class GraduateStudent extends CollegeStudent {

	private String supervisor;

	public GraduateStudent(int no, String name, String sex, String major, String supervisor, int score) {
		super(no, name, sex, major, score);
		this.supervisor = supervisor;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public void doResearch() {
		System.out.println(name + " is doing research");
	}
	@Override
	public void getGrade() {
		if (score >= 90 && score < 100) {
			System.out.println("A");
		} else if (score >= 80 && score < 90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}
}