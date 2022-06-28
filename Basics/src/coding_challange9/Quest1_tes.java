package coding_challange9;

public class Quest1_tes {

	public String str = "Java";
	public double val;
	
	 public Quest1_tes (String str1) {
		str =  str1;
		 
	 }
	 public Quest1_tes () {
		 //str = "java";
	 }
	 public Quest1_tes (double dval) {
		   val = dval;
 	 }
	 public Quest1_tes (String str2, double dval) {
		 str = str2  ;
		 val = dval;
		 
	 }
	 public void print() {
		 System.out.println("str = "+ str + " val = " + val);
	 }
}
