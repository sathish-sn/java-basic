package Coding_Challenge8;

import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {
		
		do {
			System.out.println("enter the number ");
			Scanner scan = new Scanner(System.in);
			int num =  scan.nextInt();
			
			System.out.println("Enter 0 to exit ");
			if(num == 0) {
				System.out.println("exiting the program");
				return;
			}else
				System.out.println("You entered :" + num);
		}while(true);
	}

}
