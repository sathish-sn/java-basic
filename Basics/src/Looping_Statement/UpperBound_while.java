package Looping_Statement;

import java.util.Scanner;

public class UpperBound_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = scan.nextInt();
		int sum = 0;
		while(num!=0)
		{
			sum = sum + num;
			num--;
		}
		System.out.println("sum="+ sum);
	}

}
