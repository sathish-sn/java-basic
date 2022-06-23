package BranchingStatement;

public class Example {

	public static void main(String[] args) {
		   int i;
	        outer: 
	        do {
	            i = 5;
	            inner:
	            while (true) {
	                System.out.println(i--);
	                if (i == 4) {
	                    break;
	                }
	            }
	        } while (true);
	}

}
