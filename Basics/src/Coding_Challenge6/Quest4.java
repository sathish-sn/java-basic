/**
 * Following code creates an asymmetrical 2-Dimensional int array:
int [][] arr = {
{9, 76, 17, 39},
{8, 87},
{16, 99, 231},
{187}
};
Write logic to store all the array elements of 2-Dimensional array to 1-Dimensional array.
You should have following 1-D array:
9 76 17 39 8 87 16 99 231 187
Finally write code to print all the elements of above One-Dimensional array.
 */


package Coding_Challenge6;

public class Quest4 {

	public static void main(String[] args) {
		int [][] arr = {
				{9, 76, 17, 39},
				{8, 87},
				{16, 99, 231},
				{187}
				};
		int count = 0;
		for(int[] rows : arr) {
			for(int val : rows) {
				count++;
			}
		}
		int[] res = new int[count+1];
		int i = 0;
			for(int j=0; j<arr.length;j++) {
			
				for( int k=0; k<arr[j].length; k++) {
					i++;
					//System.out.print(arr[j][k] +" ");
					
					res[i] = arr[j][k];
					//System.out.print(res[i] + " ");
					
				}
			}
		//System.out.println();
		
		for( i=1; i<=count; i++) {
			System.out.print(res[i] + " ");
		}
	}
		
		
		
}
