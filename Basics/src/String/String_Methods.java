package String;

public class String_Methods {

	public static void main(String[] args) {
		String s1 = "Cricket";
		System.out.println("01->"+s1.concat(" Match"));
		
		System.out.println("02->"+ "ABC".compareTo("ABC"));
		System.out.println("03->"+ "ABC".compareTo("abc"));
		System.out.println("04->"+ "ABC".compareToIgnoreCase("abc"));
		String s2 = s1.replace('t', 'T');
		System.out.println("05->" + s2);
		System.out.println("06->" + s1.substring(0));
		System.out.println("07->" + s1.substring(3,6));
		System.out.println("08->" + s1.startsWith("c"));
		System.out.println("08.1->" + s1.startsWith("Cri"));
		System.out.println("09->" + s1.endsWith("T"));
		System.out.println("09.1->" + s2.endsWith("eT"));
		System.out.println("10->" + s2.endsWith("T"));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
