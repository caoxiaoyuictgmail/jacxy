package practiceEveryDay;

import java.util.Scanner;

public class ShuZhiXZhuanHuan {
	public static void main(String[] args) {
		byte a = (byte) 555;
		System.out.println(a);
		
		
		//run year suanfa
		Scanner scann = new Scanner(System.in);
		System.out.println("Please enter a year!");
		int year = scann.nextInt();
		
		if(year%4 == 0 && year%100 !=0 || year %400 == 0) {
			System.out.println("This year is run year!");
		} else 
			System.out.println("This year is not run year!");
		
	}
}
