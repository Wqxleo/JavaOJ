package com.homework04D;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String model = scan.next();
		double fre = scan.nextDouble();
		String core = scan.next();
		CPU cpu = new CPU(model, fre, core);
		model = scan.next();
		Mainboard mainboard = new Mainboard(model);
		model = scan.next();
		int size = scan.nextInt();
		Memory memory = new Memory(model, size);
		model = scan.next();
		size = scan.nextInt();
		Screen screen = new Screen(model, size);
		model = scan.next();
		size = scan.nextInt();
		Harddisk harddisk = new Harddisk(model, size);
		Computer com1 = new Computer(cpu, mainboard, memory, screen, harddisk);
		
		model = scan.next();
		fre = scan.nextDouble();
		core = scan.next();
		cpu = new CPU(model, fre, core);
		model = scan.next();
		mainboard = new Mainboard(model);
		model = scan.next();
		size = scan.nextInt();
		memory = new Memory(model, size);
		model = scan.next();
		size = scan.nextInt();
		screen = new Screen(model, size);
		model = scan.next();
		size = scan.nextInt();
		harddisk = new Harddisk(model, size);
		Computer com2 = new Computer(cpu, mainboard, memory, screen, harddisk);
		
		System.out.println(com1.equals(com2));
		System.out.print(""+"Computer1:\n"+com1+"Computer2:\n"+com2);
	}

}
interface Model{
	public static void model(String m){
	}
}
class CPU implements Model{
	String cpu_model;
	double cpu_fre;
	String cpu_core;
	public CPU(String m, double f, String c) {
		cpu_model = m;
		cpu_fre = f;
		cpu_core = c;
	}
	public static void model(String m){
	}
	public String toString() {
		return "CPU:\nModel: "+cpu_model+"\nFrequency: "+String.format("%.1f",cpu_fre)+"\nNumber of Cores: "+cpu_core+"\n";
	}
	public boolean equals(CPU c) {
		if (cpu_model.equals(c.cpu_model) && cpu_fre == c.cpu_fre && cpu_core.equals(c.cpu_core)) {
			return true;
		}
		return false;
	}
}
class Mainboard implements Model{
	String main_model;
	public Mainboard(String m) {
		main_model = m;
	}
	public static void model(String m){
	}
	public String toString() {
		return "Mainboard:\nModel: "+main_model+"\n";
	}
	public boolean equals(Mainboard c) {
		if (main_model.equals(c.main_model)) {
			return true;
		}
		return false;
	}
}
class Memory implements Model{
	String Memory_model;
	int Memory_size;
	public Memory(String m, int s) {
		Memory_model = m;
		Memory_size = s;
	}
	public static void model(String m){
	}
	public String toString() {
		return "Memory:\nModel: "+Memory_model+"\nSize: "+Memory_size+"\n";
	}
	public boolean equals(Memory c) {
		if (Memory_model.equals(c.Memory_model) && Memory_size == c.Memory_size) {
			return true;
		}
		return false;
	}
}
class Screen implements Model{
	private String scrmodel;
	private int scrsize;
	public Screen(String m, int s) {
		scrmodel = m;
		scrsize = s;

	}
	
	
	public String getScreen_model() {
		return scrmodel;
	}


	public void setScreen_model(String screen_model) {
		scrmodel = screen_model;
	}


	public int getScrsize() {
		return scrsize;
	}


	public void setScrsize(int scrsize) {
		this.scrsize = scrsize;
	}


	public static void model(String m){
	}
	public String toString() {
		return "Screen:\nModel: "+scrmodel+"\nSize: "+scrsize+"\n";
	}
	public boolean equals(Screen c) {
		if (scrmodel.equals(c.scrmodel) && scrsize == c.scrsize) {
			return true;
		}
		return false;
	}
}
class Harddisk implements Model{
	private String harmodel;
	private int harsize;
	public Harddisk(String m, int s) {
		harmodel = m;
		harsize = s;

	}
	
	
	public String getHarmodel() {
		return harmodel;
	}


	public void setHarmodel(String harmodel) {
		this.harmodel = harmodel;
	}


	public int getHarsize() {
		return harsize;
	}


	public void setHarsize(int harsize) {
		this.harsize = harsize;
	}


	public static void model(String m){
	}
	public String toString() {
		return "Harddisk:\nModel: "+harmodel+"\nSize: "+harsize+"\n";
	}
	public boolean equals(Harddisk c) {
		if (harmodel.equals(c.harmodel) && harsize == c.harsize) {
			return true;
		}
		return false;
	}
}
class Computer{
	private CPU cpu;
	private Mainboard mainboard;
	private Memory memory;
	private Screen screen;
	private Harddisk harddisk;
	
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Mainboard getMainboard() {
		return mainboard;
	}
	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Harddisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}
	public Computer(CPU c, Mainboard ma, Memory me, Screen s, Harddisk h) {
		cpu = new CPU(c.cpu_model, c.cpu_fre, c.cpu_core);
		mainboard = new Mainboard(ma.main_model);
		memory = new Memory(me.Memory_model, me.Memory_size);
		screen = new Screen(s.getScreen_model(), s.getScrsize());
		harddisk = new Harddisk(h.getHarmodel(), h.getHarsize());
	}
	public boolean equals(Computer c) {
		if (cpu.equals(c.cpu) 
				&& mainboard.equals(c.mainboard) 
				&& memory.equals(c.memory) 
				&& screen.equals(c.screen) 
				&& harddisk.equals(c.harddisk)) {
			return true;
		}
		return false;
	}
	public String toString() {
		return cpu.toString()+mainboard.toString()+memory.toString()+screen.toString()+harddisk.toString();
	}
}

