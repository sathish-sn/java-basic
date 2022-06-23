/**
 * Write a Java Program to store numbers from 1 to 1000 in One-dimensional array and then print array contents as follows (10 elements per row):
1    2    3    4    5    6    7    8    9    10    
11    12    13    14    15    16    17    18    19    20    
21    22    23    24    25    26    27    28    29    30    
.
.
.
991    992    993    994    995    996    997    998    999    1000    
 */

package Arrays;

public class oneD_1_1000 {

	public static void main(String[] args) {
		int []arr =new int[1000];
		for(int i=0,j=1;i<arr.length;i++,j+=1)
		{
			arr[i]=j;
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%10==0) {
				System.out.print(arr[i]);
				System.out.println();
			}else 
				System.out.print(arr[i] + " ");
			
		}
	}

}
