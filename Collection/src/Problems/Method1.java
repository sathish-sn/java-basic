package Problems;

import java.util.ArrayList;

public class Method1 {

	public static void main(String[] args) {
		String s = "((2*5)+(5+9)/2-3";
		int add=0,sub=0,mul=0,div=0;
		ArrayList num = new ArrayList();
		ArrayList<Character> opr = new ArrayList<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '+' || c == '-' || c == '*' || c =='/') {
				opr.add(c);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
				if(Character.isDigit(c) ){
				num.add(c);
				}
			
		}
		l1: for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if((s.charAt(i-2)=='+' || s.charAt(i-2)=='-' || s.charAt(i-2)=='-' || s.charAt(i-2)=='/') && c == ')' ) {
				System.out.println(s.charAt(i-2));
				switch(s.charAt(i-2)) {
				case '+':
					add =  Character.getNumericValue(s.charAt(i - 3)) + Character.getNumericValue(s.charAt(i - 1));
					System.out.println(add);
					break l1;
				case '-':
					sub =  Character.getNumericValue(s.charAt(i - 3)) - Character.getNumericValue(s.charAt(i - 1));
					break l1;
				case '*':
					mul =  Character.getNumericValue(s.charAt(i - 3)) * Character.getNumericValue(s.charAt(i - 1));
					System.out.println(mul);
					break l1;
				case '/':
					div =  Character.getNumericValue(s.charAt(i - 3)) / Character.getNumericValue(s.charAt(i - 1));
					
					break l1;
					
					
				}
				
			}
		}
		
		System.out.println(opr);
		System.out.println(num);
	}

}
