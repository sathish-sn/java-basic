/**
 * 
 * @author Sathisha Narayana
 * Below is One-dimensional array code:
char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};

Write the code to search for particular character in above array.
If I search for 'B', then output should be: "B found!"
If I search for 'E', then output should be: "E Not found!"
 *
 */
package Arrays;

public class ArrayQ_3 {

	public static void main(String[] args) {
		char arr[] = new char[] { 'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C' };
		char find = 'P';
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (find == arr[i]) {
				System.out.println(arr[i] + " found");
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println(find + " Not found");
		}
	}

}
