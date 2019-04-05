package com.homework4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int weight_sum = 0;
		int n = 0;
		int num  = 0;
		int weight = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		
		TV []tv = new TV[10];
		AirConditioner []airConditioner = new AirConditioner[10];
		WashMachine []washMachine = new WashMachine[10];
		for(int i = 0; i < n; i++) {
			num = in.nextInt();
			weight = in.nextInt();
			
			if(num == 1) {
			   tv[index1++] = new TV(weight);
			}
			if(num == 2) {
				washMachine[index2++] = new WashMachine(weight);
			}
			if(num == 3) {
				airConditioner[index3++] = new AirConditioner(weight);
			}
			weight_sum += weight;
		}
		
		System.out.println(weight_sum);
	}

	

}
interface Appliance{
	
}
class TV implements Appliance{
	int weigth;

	public TV(int weigth) {
		this.weigth = weigth;
	}
	
}
class WashMachine{
	int weigth;

	public WashMachine(int weigth) {
		this.weigth = weigth;
	}
	
}
class AirConditioner{
	int weigth;
	public AirConditioner(int weigth) {
		this.weigth = weigth;
	}
	
}
class Truck{
	int sum;
	
}