package com.homework04B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		int no = 0;
		String name = null;
		int age = 0;
		String seminary= null;
		
		Scanner in = new Scanner(System.in);

		Teacher ts[] = new Teacher[2];
		for(int i = 0;i < 2;i++) {
			no = in.nextInt();
			name = in.next();
			age = in.nextInt();
			seminary = in.next();
			ts[i] = new Teacher(no,name,age,seminary);

		}

		System.out.println(ts[0].toString());
		System.out.println(ts[1].toString());
		if (ts[0].getNo() == ts[1].getNo()){
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}

		
		
	}

}
class Teacher{
	private int no;
	private String name;
	private int age;
	private String seminary;
	
	public Teacher(int no, String name, int age, String seminary) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.seminary = seminary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getSeminary() {
		return seminary;
	}
	public void setSeminary(String seminary) {
		this.seminary = seminary;
	}
	public boolean equals(Teacher teacher) {
		if(teacher == null){
			return  false;
		}
		else {
			if (this.no == teacher.no){
				return true;
			}
		}
		return  false;
		
	}
	@Override
	public String toString() {
		String str = "no: " + no + ", name:" + name + ", age: " + age +", seminary: " + seminary;
		return str;
	}


	
}
