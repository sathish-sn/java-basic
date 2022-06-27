/**
 * Following code creates an asymmetrical 2-Dimensional int array:
int [][] numbers = {
{90, 10, 231},
{-20, 80, 100, 23, 54},
{45, 22},
{87, 98, -100, 49, 73, 35, 19}
};
Write logic to find out highest number in above array.
 */


package Coding_Challenge6;

public class Multi_DQ3 {

	public static void main(String[] args) {		
		  int [][] ar = {
				{90, 10, 231},
				{-20, 80, 100, 23, 54},
				{45, 22},
				{87, 98, -100, 49, 73, 35, 19}
				};
		 //int[] high = new int[4];
		 int temp=0;
		 for(int i=0; i<ar.length; i++)
		 { 
			 //temp = 0;
			 for(int j=0; j<ar[i].length; j++)
			 {
				 if(ar[i][j]>temp)
				 {
					 temp = ar[i][j];
				 }
				 
			 }
			// high[i] = temp;
		 }
		// System.out.println(temp);
//		 //System.out.println(temp1);
//		 for(int i=0;i<high.length; i++) {
//			 System.out.print(high[i] + " ");
//		 }
//		 System.out.println();
//		 for(int i=0; i<high.length; i++) {
//			
//			 if(high[i]>temp)
//			 	{
//				 	temp = high[i];
//			 	}
//			 }
		 
		 System.out.println("The largest number in the given Array is " + temp);
	}

}
