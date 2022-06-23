package Looping_Statement;

import java.util.Scanner;

public class Odd_using_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the start num");
		int start = scan.nextInt();
		System.out.println(" enter the end num");
		int end = scan.nextInt();
//		while(start<=end)
//		{
//			if(start==end || start+1==end)
//			{
//				if(start%2!=0)
//				{
//					System.out.println(start);
//				}
//			}else if(start%2!=0)
//			{
//				System.out.print(start + ",");
//				
//			}
//			start++;
//			
//		}
		while(start<=end)
		{
			if(start%2!=0)
			{
				System.out.print(start);
			}
			if(start%2!=0 && start+1 != end)
			{
				System.out.print(",");
				
			}
			start++;
		}
	
		
		}
	}


