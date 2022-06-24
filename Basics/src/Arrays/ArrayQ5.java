/**
 * In mathematics, the Fibonacci series are the numbers in the following integer sequence:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
and each subsequent number is the sum of the previous two.

Write a Java Program to generate above series till n number of times (For example you can try with
n = 10 and n = 15) and store it in One-dimensional array.
For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

Write a for loop to print all the elements of the array.
 */


package Arrays;

public class ArrayQ5 {

	public static void main(String[] args) {
         int n = 15;
		int[] ar = new int[n];
		ar[0] = 0;
		ar[1] = 1;
		
		for(int i=1; i<n-1; i++) {
			ar[i+1] = ar[i]+ar[i-1];
			
		}
		for(int i=0; i<n; i++) {
			System.out.print(ar[i] +", ");
		}
	}
}
