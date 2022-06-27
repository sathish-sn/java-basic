/**
 * Write a java program to create following 2-Dimensional array of 8 * 8 size [to resemble chess board]
using Data instantiation:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
Write a nested for loop to print all the elements of 2-Dimensional array in above format
 */


package Coding_Challenge6;

public class Multi_DQ2 {

	public static void main(String[] args) {
		char[][]ar = new char [8][8];
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar.length; j++)
			{
				if((i+j)%2 == 0)
				{
					ar[i][j] = 'W';
				}else {
					ar[i][j] = 'B';
				}
			
			}
		}
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar.length; j++)
			{
				System.out.print(ar[i][j] + " ");
			}
		      System.out.println();
		}
	}

}
