/**
 * Write nested enhanced for-loop to iterate through following 2-Dimensional array:
char [][] arr = {
{'*'},
{'*', '*'},
{'*', '*', '*'},
{'*', '*', '*', '*'},
{'*', '*', '*', '*', '*'},
{'*', '*', '*', '*', '*', '*'},
{'*', '*', '*', '*', '*', '*', '*'},
};
 */


package CodingChallenge7;

public class Quest1 {

	public static void main(String[] args) {
		char [][] arr = {
				{'*'},
				{'*', '*'},
				{'*', '*', '*'},
				{'*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*', '*', '*'},
				};
		
		for(char[] x : arr) {
			for(char val : x) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
		
	}

}
