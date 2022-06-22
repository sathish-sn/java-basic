package Looping_Statement;

import java.util.*;
public class Even_Using_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the start num");
		int start = scan.nextInt();
		System.out.println(" enter the end num");
		int end = scan.nextInt();
		
		while(start<=end/2)
		{
			/*if(i%2==0)
			{
				System.out.println(i);
			}
			
			i++;*/
			
			 
			System.out.println(start*2);
			start++;
		}
		
	}

}
