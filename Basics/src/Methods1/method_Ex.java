package Methods1;

public class method_Ex {
	
	public String name;
	public int score1 ;
	public int score2;
	public int score3;
	 public method_Ex(String n , int s1, int s2, int s3) {
		 name = n;
		 score1 = s1;
		 score2 = s2;
		 score3 = s3;
		 
	 }
	 public void displayGreating() {
		 System.out.println("welcome "+ name + "!");
	 }
	 public  int totalScore() {
		  return score1+score2+score3;
	 }
	 public int totalSum(int s1 ,int s2, int s3) {
		 return s1+s2+s3;
	 }
	 public static String[] converToarray(String s1, String s2) {
		 String arr[] = {s1,s2};
		 return arr;
	 }

}
