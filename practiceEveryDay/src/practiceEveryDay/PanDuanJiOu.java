package practiceEveryDay;

import java.util.Scanner;

public class PanDuanJiOu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Judege one number is ji or ou, please enter the number!");
		long tmp = scan.nextLong();
		boolean result = tmp % 2 == 0 ? true : false;
		String resultBetter = (tmp % 2 == 0) ? "this number is oushu" : "this number is jishu";
		System.out.println("The number is ourshu:" + result);
		
	}
}
