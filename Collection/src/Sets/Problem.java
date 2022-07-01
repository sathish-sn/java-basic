package Sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Problem {

	public static void main(String[] args) {
		
		String s = "((2+1)*(3+4)*(9+8))";
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//
//		for(int i=0; i<s.length();i++) {
//			char c = s.charAt(i);
//			set.add(c);
//			
//		}
//		System.out.println("LinkedHashSet : "+set);
//		ArrayList ar = new ArrayList(set);
//		System.out.println(ar);
//		for(int i=0; i<ar.size();i++) {
//			switch(i) {
//			case "+" :
//				for(int j=0; j<ar.size();) {
//					
//				}
//			}
//			
//		}
		int[] num = new int[10];
		int num1=0, num2=0,num3=0;
		int res = 1;
		int k=0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			//System.out.print(c + " ");
			if(c == '+') {
			k++;
				//System.out.println("found at" + i);
				
				
			
					//System.out.println("entering for of +");
//				  num1 = Character.getNumericValue(s.charAt(i-1));
//				  num2 =Character.getNumericValue(s.charAt(i+1));
				  
			num[k] = Character.getNumericValue(s.charAt(i-1)) + Character.getNumericValue(s.charAt(i+1));
			//System.out.println(num1+num2);
					
				//System.out.println("num3" +num3);
					//continue;
			}
			else {
				continue;
			}
		}
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '*') {
//				System.out.println("found at" + i);
//				System.out.println("entering for of *");
				System.out.println(num.length);
				for(int j=1; j<num.length;j++) {
					res = res*num[j];
					//System.out.println(num[j]);
					//break;
					//System.out.println(res);
				}
			}
			
			
		}
			
		for(int j=1; j<num.length;j++) {
			res = res*num[j];
			System.out.println(num[j]);
		
			//System.out.println(res);
		}
			
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[1]*num[2]);
//		System.out.println(res);
	}

}
