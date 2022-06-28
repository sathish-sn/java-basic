package Methods1;

public class Method_main {

	public static void main(String[] args) {

		method_Ex x  = new method_Ex("Jack", 50, 60, 90);
		x.displayGreating();
		System.out.println("...........................");
		int res = x.totalScore();
		System.out.println("Total Score = "+ res);
		int sum =x.totalSum(90, 30, 40);
		System.out.println("Total Sum = "+ sum);
		String [] out = method_Ex.converToarray("Hello", "Bro");
		for(String a : out) {
		System.out.print(a + " ");
		}
		}

}
