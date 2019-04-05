package com.homework3f;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int type = scan.nextInt();
		String result = scan.nextLine();
		BallMatch bm = new BallMatch(type,result);
		bm.compete();
		
		scan.close();
	}
}
class BallMatch{
	int type;
	String result;
	public BallMatch(int type, String result) {
		this.type=type;
		this.result = result;
	}
	public void compete(){
		//表示整个比赛过程
		checkin();
		start();
		play();
		end();
		annouceResult();
		
	}
	public void checkin() {
		System.out.println("now checking in");
	}
	public void start() {
		
		System.out.println("now starting");
	}
	public void play() {
		if(type == 1) {
			System.out.println("now playing "+"football");
		}else if(type == 2) {
			System.out.println("now playing "+"basketball");
		}
	}
	public void end() {
		System.out.println("now ending");
	}
	public void annouceResult() {
		System.out.print("now annoucing result:"+result);
	}
}

