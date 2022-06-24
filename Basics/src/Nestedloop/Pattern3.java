/**
 * Print following chess board using nested for loops.
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
 */

package Nestedloop;

public class Pattern3 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 8; i++) 
		{
			for(int j=1; j<=8; j++)
			{
				if(i%2!=0 && j%2!=0)
				{
					System.out.println("W" + " ");
				}else {
					System.out.println("B" + " ");
				}
			}
			System.out.println();
			
		}
	}

}
