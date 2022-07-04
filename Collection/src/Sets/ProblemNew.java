package Sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ProblemNew {


	public static void main(String[] args) {

		String s = "((2+1)*(3+4)*(4-1)*(4/2)*(3*2)";
		ArrayList<Integer> sum = new ArrayList<Integer>();
		ArrayList<Integer> sub = new ArrayList<Integer>();
		int res = 1;
		int add =0;
		int k=-1;
	
		ArrayList ar = new ArrayList();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == '+' && c != '(' && c != ')') {
				
	
				if(s.charAt(i-2) == '+' || s.charAt(i-2) == '-' || s.charAt(i-2) == '*' || s.charAt(i-2) == '/') {
					
					sum.remove(k);
					 add = add + Character.getNumericValue(s.charAt(i+1));
					// System.out.println(add+ "i=" + i);
					 
				}else {
					k++;
				 add = Character.getNumericValue(s.charAt(i - 1)) + Character.getNumericValue(s.charAt(i + 1));
				 
				
				}
				//System.out.println(add+ "i=" + i);
				sum.add(add);
				
			
				
			}
			if (c == '-' && c != '(' && c != ')') {
				k++;
				int sub1 = Character.getNumericValue(s.charAt(i - 1)) - Character.getNumericValue(s.charAt(i + 1));
				sum.add(sub1);
			}
			if (c == '*' && s.charAt(i+1) != '(' && s.charAt(i-1) != ')') {
			k++;
				int mul = Character.getNumericValue(s.charAt(i - 1)) * Character.getNumericValue(s.charAt(i + 1));
				//System.out.println(mul + " i="+ i);
				sum.add(mul);
			}if (c == '/' && s.charAt(i+1) != '(' && s.charAt(i-1) != ')') {
			k++;
				int div = Character.getNumericValue(s.charAt(i - 1)) / Character.getNumericValue(s.charAt(i + 1));
				//System.out.println(mul + " i="+ i);
				sum.add(div);
			}

		}

		for (int i = 0; i < sum.size(); i++) {
			System.out.print(sum.get(i) + " ");
		}
	for (int j = 0; j < sum.size(); j++) {
			
			if (j == sum.size()) {
				break;
			}
			res = res * sum.get(j);
		}
		System.out.println();
		System.out.println(res);
	}
}
