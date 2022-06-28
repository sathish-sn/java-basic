/**
 * Below is the code snippet:
package challenge8;
import java.util.Scanner;
public class Ques06 {
public static void main(String[] args) {
String [] indianCricketers = {
"Rahul", "Sachin", "Sourav", "Sunil", "Ashwin", "Dhoni", "Sehwag",
"Rahane", "Raina", "Virat", "Jadeja", "Kumble", "Prasad", "Rohit",
"Dinesh", "Harbhajan", "Ishant" };
//TODO: Type your logic here
}
}
String array “indianCricketers” stores the names of some to the indian cricketers.
To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
Complete this code to search for particular name. This search should be case-insensitive.
If you search for Sourav/sourav/SOURAV, then you should get following output:
SOURAV found at index: 2 and program should terminate.
NOTE: Name should be in upper case in the message, even though your search string is in any case.
If name is not found in the list, the display following:
AKASH not found in the list. Would you like to search another name? (1 to continue):
If user’s input is 1, then re-run the logic, otherwise terminate the program.
 * 
 */

package Coding_Challenge8;

import java.util.*;

public class Quest6 {

	public static void main(String[] args) {

		String[] indianCricketers = { "Rahul", "Sachin", "Sourav", "Sunil", "Ashwin", "Dhoni", "Sehwag", "Rahane",
				"Raina", "Virat", "Jadeja", "Kumble", "Prasad", "Rohit", "Dinesh", "Harbhajan", "Ishant" };

		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("Enter the name of the cricketer :");
			String str = scan.nextLine();

			for (int i = 0; i < indianCricketers.length; i++) {
				//System.out.println(indianCricketers[i]);
				if (indianCricketers[i].equalsIgnoreCase(str)) {
					System.out.println(indianCricketers[i] + " found at the index " + (i));
					return;
				}
			}

			System.out.println(str + " not found in the list. Would you like to search another name? (1 to continue): ");
			int num = scan.nextInt();
			if (num == 1) {
				scan.nextLine();
				continue;
			} else {

				return;
			}
		}

	}

}
