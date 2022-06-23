/**
 * short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
If score is greater than or equal to 50 but less than 100, it is regarded as half-century.
If score is greater than or equal to 100 but less than 200, it is regarded as a century.
If score is greater than or equal to 200, it is regarded as a double-century.
 */

package Arrays;

public class ArrayQ_4 {

	public static void main(String[] args) {
		 short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		 int cent =0, half_cent = 0, d_cent =0;
		for(int i=0; i<scores.length; i++)
		{
			if(scores[i]>50 && scores[i]<100 )
			{
				half_cent++;
			}
			if(scores[i]>=100 && scores[i]<200 )
			{
				cent++;
			}
			if( scores[i]>=200 )
			{
				d_cent++;
			}
		}
		System.out.println("No of century ="+ cent);
		System.out.println("No of half century ="+ half_cent);
		System.out.println("No of double century ="+ d_cent);
	}

}
